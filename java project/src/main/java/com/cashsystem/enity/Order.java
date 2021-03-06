package com.cashsystem.enity;

import com.cashsystem.common.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-04
 * Time: 10:37
 **/

@Data
public class Order {
    private String id;

    private Integer account_id;

    private String account_name;

    private LocalDateTime creat_time;

    private LocalDateTime finsh_time;

    private Integer actual_amount;

    private Integer total_money;
    
    private OrderStatus order_status;

    //存放订单的list
    public List<OrderItem> orderItemList = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("【订单信息】*************************************").append("\n");
        sb.append("\t").append("【用户名称】：").append(this.getAccount_name()).append("\n");
        sb.append("\t").append("【订单编号】：").append(this.getId()).append("\n");
        sb.append("\t").append("【订单状态】：").append(this.getOrder_status().getDesc()).append("\n");
        sb.append("\t").append("【创建时间】：").append(this.timeToString(this.getCreat_time())).append("\n");
        if (this.getOrder_status() == OrderStatus.OK) {
            sb.append("\t").append("【完成时间】：")
                    .append(this.timeToString(this.getFinsh_time())).append("\n");
        }
        sb.append("【订单明细】*************************************").append("\n");
        sb.append("\t编号   名称     数量     单位     单价（元）").append("\n");
        int i = 0;
        for (OrderItem orderItem : this.getOrderItemList()) {
            sb.append("\t").append(++i).append(".    ")
                    .append(orderItem.getGoods_name()).append("      ")
                    .append(orderItem.getGoods_num()).append("       ")
                    .append(orderItem.getGoods_unit()).append("       ")
                    .append(this.moneyToString(orderItem.getGoods_price())).append("        ")
                    .append("\n");
        }
        sb.append("【订单金额】*************************************").append("\n");
        sb.append("\t").append("【总金额】：").append(this.moneyToString(this.getTotal_money()))
                .append(" 元 ").append("\n");
        sb.append("\t").append("【优惠金额】：").append(this.moneyToString(this.getDiscount()))
                .append(" 元 ").append("\n");
        sb.append("\t").append("【应支付金额】：").append(this.moneyToString(this.getActual_amount()))
                .append(" 元 ").append("\n");
        return sb.toString();
    }

    private String moneyToString(int money) {
        return String.format("%.2f", 1.00D * money / 100);
    }

    private String timeToString(LocalDateTime time) {
        return DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(time);
    }

    //优惠
    public Integer getDiscount() {
        return this.getTotal_money() - this.getActual_amount();
    }

}    
    
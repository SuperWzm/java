package com.cashsystem.cmd.impl.order;

import com.cashsystem.cmd.Subject;
import com.cashsystem.cmd.annotation.CommandMeta;
import com.cashsystem.cmd.annotation.CustomerCommand;
import com.cashsystem.cmd.impl.AbstractCommand;
import com.cashsystem.common.OrderStatus;
import com.cashsystem.enity.Goods;
import com.cashsystem.enity.Order;
import com.cashsystem.enity.OrderItem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-04
 * Time: 11:45
 **/
@CommandMeta(
        name = "LLDD",
        desc = "浏览订单",
        group = "订单信息"
)
@CustomerCommand
public class OrderBrowseCommand extends AbstractCommand {

    @Override
    public void execute(Subject subject) {
        System.out.println("我的订单列表：");
        List<Order> orderList = this.orderService.queryOrderByAccount(subject.getAccount().getId());

        if(orderList.isEmpty()){
            System.out.println("暂时没有订单");
        }else{
            for (Order order:orderList) {
                System.out.println("=========开始打印订单===========");
                System.out.println(order);
                System.out.println("=========结束打印订单===========");
            }
        }
    }
}
    
package com.cashsystem.enity;

import lombok.Data;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-04
 * Time: 10:43
 **/

@Data
public class OrderItem {
    private String id;

    private String order_id;

    private Integer goods_id;

    private String goods_name;

    private String goods_introduce;

    private Integer goods_num;

    private String goods_unit;

    private Integer goods_price;

    private Integer goods_discount;

}
    
package com.cashsystem.cmd.impl;

import com.cashsystem.enity.Goods;
import com.cashsystem.service.AccountService;
import com.cashsystem.service.GoodsService;
import com.cashsystem.service.OrderService;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-04
 * Time: 11:53
 **/
public abstract class AbstractCommand implements Command{
    //启动所有的服务
    public AccountService accountService;
    public GoodsService goodsService;
    public OrderService orderService;

    public AbstractCommand() {
        this.accountService = new AccountService();
        this.goodsService = new GoodsService();
        this.orderService = new OrderService();
    }
}
    
package com.cashsystem.cmd.impl.goods;

import com.cashsystem.cmd.Subject;
import com.cashsystem.cmd.annotation.AdminCommand;
import com.cashsystem.cmd.annotation.CommandMeta;
import com.cashsystem.cmd.impl.AbstractCommand;
import com.cashsystem.enity.Goods;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-04
 * Time: 11:44
 **/
@CommandMeta(
        name = "XJSP",
        desc = "下架商品",
        group = "商品信息"
)
@AdminCommand
public class GoodsSoldOutCommand extends AbstractCommand {

    @Override
    public void execute(Subject subject) {
        System.out.println("请输入下架商品编号：");
        int goodsId = scanner.nextInt();
        Goods goods = this.goodsService.getGoods(goodsId);
        if(goods == null){
            System.out.println("商品不存在");
        }else{
            System.out.println("下架商品如下：");
            System.out.println(goods);
            System.out.println("请确认是否要下架？  y/n");
            String str = scanner.next();
            if("y".equalsIgnoreCase(str)){

                boolean effect = this.goodsService.soldoutGoods(goods);
                if(effect){
                    System.out.println("成功下架此商品");
                }else{
                    System.out.println("下架失败，请稍后重试");
                }
           }else{
                System.out.println("您选择了不下架此商品");
            }
        }
    }
}
    
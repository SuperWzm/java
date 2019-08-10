package com.cashsystem.service;

import com.cashsystem.dao.GoodsDao;
import com.cashsystem.enity.Goods;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-06
 * Time: 15:45
 **/
public class GoodsService {
    public GoodsDao goodsDao;
    public GoodsService(){
        this.goodsDao = new GoodsDao();
    }
    public List<Goods> quarryAllGoods(){
        return this.goodsDao.quarryAllGoods();
    }

    public boolean putAwayGoods(Goods goods){
        return this.goodsDao.putAwayGoods(goods);
    }

    public Goods getGoods(int goodsId){
        return this.goodsDao.getGoods(goodsId);
    }

    public boolean modifyGoods(Goods goods) {
       return this.goodsDao.modifyGoods(goods);
    }

    public boolean soldoutGoods(Goods goods){
        return this.goodsDao.soldoutGoods(goods);
    }

    public boolean updateAfterPay(Goods goods, Integer buyGoodsNum) {
        return this.goodsDao.updateAfterPay(goods,buyGoodsNum);
    }
}
    
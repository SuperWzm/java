package com.bit.inter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-19
 * Time: 21:45
 **/
public class TestMessage {

    public static void main(String[] args) {
        Message qqMessage = new QQMessage();
        Message wechatMessage = new WechatMessage();
        Message msnMessage = new MsnMessage();

        qqMessage.print();
        System.out.println(wechatMessage.company());

        wechatMessage.print();
        System.out.println(wechatMessage.company());

        msnMessage.print();
        System.out.println(msnMessage.company());

        Message.printInfo();
    }
}    
    
package com.bit.inter;

public interface Message {

    //接口中定义普通方法
    default String company(){
        return "未知";
    }

    //静态方法
    static void printInfo(){
        System.out.println("这是接口的静态方法");
    }

    void print();
}

class QQMessage implements Message{

    @Override
    public String company() {
        return "腾讯";
    }

    @Override
    public void print() {
        System.out.println("这是QQMessage");

    }
}

class WechatMessage implements Message{


    @Override
    public void print() {
        System.out.println("这是微信的Meessage");
    }
}

class MsnMessage implements Message{

    @Override
    public void print() {
        System.out.println("这是MSN的message");
    }
}
package com.bit.inter;

public interface IMessage {

    void print();

    public static void main(String[] args) {

        //内部类
        //IMessage接口的匿名内部类的实例化对象

        IMessage iMessage = new IMessage() {
            @Override
            public void print() {
                System.out.println("hello imessage");
            }
        };
        iMessage.print();

//        IMessage iMessage = () -> System.out.println("hello imessage");
//        iMessage.print();

        //接口 =》 面向对象的
        //函数接口 =》 面向对象  函数编程
        //Lambda表达式（函数） =》 函数编程


        IMessage1 iMessage1 = (a,b) -> a+b;
        int sum = iMessage1.sum(1,2);
        System.out.println(sum);


    }
}

@FunctionalInterface
interface IMessage1{
    int sum(int a,int b);
}

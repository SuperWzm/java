package com.bit.en;



@FunctionalInterface
public interface IMessage {

    void print();


    public static void main(String[] args) {
//        IMessage iMessage = new IMessage() {
//            @Override
//            public void print() {
//                System.out.println("hello message");
//            }
//        };
//        iMessage.print();

//        IMessage iMessage = () -> System.out.println("hello message");
//        iMessage.print();

        //接口 —》面向对象的
        //函数接口 —》 面向对象  函数编程
        //lambda表达式（函数） —》 函数编程

        //函数编程
        IMessage1 iMessage1 = (a,b) ->{
            int sum = a+b;
            return sum;


//            System.out.println("hello java");
//            System.out.println("heloo c++");
//            System.out.println("hello python");


        };
//        iMessage1.print();

        int sum = iMessage1.sum(1,2);
        System.out.println(sum);

    }
}

@FunctionalInterface
interface  IMessage1{
    int sum(int a,int b);
}

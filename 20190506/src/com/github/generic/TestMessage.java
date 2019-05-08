package com.github.generic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-08
 * Time: 17:31
 **/
public class TestMessage {
    //Message泛型类的类型参数的具体类型String
//    public static void fun(Message<String> message) {
//        System.out.println(message.getMessage());
//    }
    //fun方法接受的Message对象的类型参数具体类型是任意类型
    public static void fun(Message<?> message){
 //      message.setMessage(111);
        System.out.println(message.getMessage());
    }

    public static void main(String[] args) {
        Message<String> message = new Message<>();
        message.setMessage("王泽明");
        fun(message);

        Message<Integer> message1 = new Message<>();
        message1.setMessage(666);
        fun(message1);
    }
}    
    
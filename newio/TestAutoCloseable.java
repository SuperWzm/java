package com.bittch.reflect.newio;



/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-25
 * Time: 22:10
 **/


//2丶
//自动关闭流
public class TestAutoCloseable {
    public static void main(String[] args) {
//        Message message = new Message();
//        try{
//            message.print();
//        }catch(Exception e){
//            e.printStackTrace();
//        }finally {
//
//            try {
//                message.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }


            try(Message message = new Message();
            ){
                message.print();

            }catch(Exception e){
                e.printStackTrace();

        }
    }
}

class Message implements AutoCloseable{

    public void print(){
        System.out.println("Message ptint 方法调用");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Message close方法执行");
    }
}
    
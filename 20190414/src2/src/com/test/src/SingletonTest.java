package com.test.src;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-14
 * Time: 9:06
 **/
class MySingleton {
    private MySingleton() {
    }
    private static class Single {
        public static MySingleton mySingleton = new MySingleton();
    }
    public static MySingleton getInstance() {
        return Single.mySingleton;
    }
}
public class SingletonTest{
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        System.out.println(mySingleton);
        MySingleton mySingleton2 = MySingleton.getInstance();
        System.out.println(mySingleton2);
    }
    /*public static void main2(String[] args) {
        //Singleton singleton = new Singleton();
        Singleton singleton =  Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton2 =  Singleton.getInstance();
        System.out.println(singleton2);
    }*/
    public static void main1(String[] args) {
        /*Singleton singleton = new Singleton();
        System.out.println(singleton);
        Singleton singleton2 = new Singleton();
        System.out.println(singleton2);
        Singleton singleton3 = new Singleton();
        System.out.println(singleton3);*/
    }
}
package com.github.generic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-08
 * Time: 17:30
 **/
public class TestPoint1 {
    public static void main(String[] args) {
        Point1<Integer> intPoint1 = new Point1<>();
//        intPoint1.setX(10);
//        intPoint1.setY("北纬38度");//这里会发生错误
//        int x = intPoint1.getX();
//        int y = intPoint1.getY();

        Point1<String> stringPoint1 = new Point1<>();
        stringPoint1.setX("东经120度");
        stringPoint1.setY("北纬38度");
        System.out.println(stringPoint1.getX()+" "+stringPoint1.getY());
    }
}    
    
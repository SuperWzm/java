package com.github.generic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-08
 * Time: 17:30
 **/
public class TestPoint2 {
    public static void main(String[] args) {
//        Point2<Integer,String> point2 = new Point2<>();
//        point2.setX(10);
//        point2.setY("北纬38度");
//        Integer x = point2.getX();
//        String y = point2.getY();
//        System.out.println("("+ x + ","+ y +")");


        Point2<Integer,Integer> point2 = new Point2<>();
        point2.setX(10);
        point2.setY(20);
        Integer x = point2.getX();
        Integer y = point2.getY();
        System.out.println("("+ x + ","+ y +")");
    }
}    
    
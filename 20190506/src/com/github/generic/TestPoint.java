package com.github.generic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-08
 * Time: 16:44
 **/
public class TestPoint {
    public static void main(String[] args) {
       /* {
            Point intPoint = new Point();
            intPoint.setX(10);
            intPoint.setY(20);
            int x = (int) intPoint.getX();
            int y = (int) intPoint.getY();
            System.out.println("Point(x,y)=(" + x + "," + y + ")");
        }
        {
            Point strPoint = new Point();
            strPoint.setX("东经120度");
            strPoint.setY("北纬38度");
            String x = (String) strPoint.getX();
            String y = (String) strPoint.getY();
            System.out.println("Point(x,y)=(" + x + "," + y + ")");
        }*/
        {
            //编译通过
            //运行异常
            Point point = new Point();
            point.setX(120.2);//double
            point.setY("北纬38度");//String
            printPoint(point);
        }

    }
    public static void printPoint(Point strPoint){
        String x = (String) strPoint.getX();
        String y = (String) strPoint.getY();
        System.out.println("Point(x,y)=(" + x + "," + y +")");
    }
}    
    
package com.github.generic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-08
 * Time: 17:30
 **/
public class Point3<T>{
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
    //泛型方法
    public <T> void printPoint(T t){
        System.out.println(t);
    }
    public <T,E> void printPoint(T t,E e){
        //处理业务
        System.out.println(e);
        System.out.println(t);
    }

    @Override
    public String toString() {
        return "Point3{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
    
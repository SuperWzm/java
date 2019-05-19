package com.bit.en;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-19
 * Time: 21:01
 **/
public enum Color implements IColor {

    //0  1      2
    RED("红色", "#ff0000"),
    GREEN("绿色", "#0ff00"),
    BLACK("黑色", "#00000"),
    BLUE("蓝色", "#0000ff");//枚举常量

    private String title;
    private final String rgb;
    private static String MESSAGE = "Hello";

    Color(String title, String rgb) {
        this.title = title;
        this.rgb = rgb;
    }


    public static void main(String[] args) {
        //1. 输出所有的枚举常量
        /*
        Color[] colors = Color.values();
        for (Color color : colors) {
            System.out.println(color);
        }
        */
        //2. 通过枚举常量的名字（String） 获取枚举常量对象
        /*
        Color color = Color.valueOf("RED");
        System.out.println(color);
        System.out.println(Color.valueOf("red"));
         */
        /*
       Color color= Enum.valueOf(Color.class, "BLUE");
        System.out.println(color);
         */
//        for (Color color : Color.values()){
//            System.out.println(color);//toString()
//        }

        //int char short
        //enum
        //String

//        Color color = Color.RED;
//        switch (color) {
//            case RED:
//                System.out.println("中国色");
//                break;
//            case BLUE:
//                System.out.println("澳大利亚");
//            case BLACK:
//                System.out.println("");
//            case GREEN:
//                System.out.println();
//            default:
//        }

        //JDK7之前不支持switch JDK7支持switch
        //不可变，unicode
        //"一" "\u4e00"
        String message = "二";
        switch (message) {
            case "一": {
                System.out.println("OK");
                break;
            }
            default:{
                System.out.println("default");
            }
        }
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.name() + " " + this.title + " rgb(" + this.rgb() + ")";
    }

    //成员方法
    public void print() {
        System.out.println(this);
    }

    @Override
    public String rgb() {
        return this.rgb;
    }
}

interface IColor {
    //#ffffff
    String rgb();
}
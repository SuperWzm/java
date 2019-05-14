package com.bit.en;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-11
 * Time: 10:32
 **/
//public enum Color {
//    RED,GREEN,BLUE;//枚举常量
//    //0    1     2
//    public static void main(String[] args) {
//        Color color = Color.RED;
//        System.out.println(color.ordinal());
//    }
//}


public enum Color  implements IColor {
    RED("红色"),
    GREEN("绿色"),
    BLACK("黑色"),
    BLUE("蓝色");//枚举常量


    private String title;
    private static String Message = "hello";

    Color(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Color{" +
                "title='" + title + '\'' +
                '}';
    }

    public void print(){

    }




    public static void main(String[] args) {
        //1丶输出所有的枚举常量
      /*Color[] colors = Color.values();
      for(Color color : colors){
          System.out.println(color);
      }*/
      //2丶通过枚举常量的名字(String) 获取枚举常量对象
//        Color color = Color.valueOf("RED");
//        System.out.println(color);
//        System.out.println(Color.valueOf("red"));


        Color color = Enum.valueOf(Color.class,"BLUE");
        System.out.println(color);
    }

    @Override
    public String rgb() {
        return null;
    }
}

interface IColor{
    String rgb();
}

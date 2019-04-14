import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-14
 * Time: 18:53
 **/
public class Test1 {
    public static void main(String[] args)  {
   /*     int a =5,b = 8 ,c;
        System.out.println("5"+a);
        System.out.println("a,b的初始值");
        System.out.println("a="+a);
        System.out.println("b="+b);
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("a,b的新值");
        System.out.println("a="+a);
        System.out.println("b="+b)*/;

      /*  int a=3,b=4,c=5,s;
        double area;
        s=(a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("该三角形的面积为"+area);*/


      double a,b,c,s;
      double area;
        Scanner in = new Scanner(System .in);
        System.out.println("请输入三角形的边长a:");
        a = in.nextDouble();
        System.out.println("请输入三角形的边长b");
        b= in.nextDouble();
        System.out.println("请输入三角形的边长c");
        c = in.nextDouble();
        s=(a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("三角形的面积为"+area);



    }
}    
    
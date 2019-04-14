import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-14
 * Time: 20:06
 **/
public class Test2 {
    public static void main(String[] args) {
        /*int i = 0, j = 0;
        if(i!=j)
            i++;
        j++;
        System.out.println(i);
        System.out.println(j);*/

       /* float w;
        double fee;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入行李重量：");
        w = in.nextFloat();
        if(w<=20){
            System.out.println("fee = 0");
        }else{
            fee = 1.2*(w-20);
            System.out.println("收费:"+fee);
        }
*/
      /*int n = 2020;
       if(n%2==0){
           System.out.println("2020是偶数");

       }else{
           System.out.println("2020是奇数");
       }*/

      /*int leapyear =2019;
      if(leapyear%4==0&&leapyear%100!=0||leapyear%400==0){
          System.out.println("闰年");
      }else{
          System.out.println("不是闰年");
      }*/

      /*Scanner in = new Scanner(System.in);
        System.out.println("请输入年份：");
        int leapyear = in.nextInt();
      if(leapyear%4==0&&leapyear%100!=0||leapyear%400==0){
          System.out.println("闰年");
      }else{
          System.out.println("不是闰年");
      }*/

     /* Scanner in = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score  = in.nextInt();
        if(score<90)
            if(score<80)
                if(score<70)
                    if(score<60)
                        System.out.println("不及格");
        else
                        System.out.println("及格");
        else
                    System.out.println("中等");
        else
                System.out.println("良好");
        else
                System.out.println("优秀");
      */

     Scanner in = new Scanner(System.in);
        System.out.println("请输入星期数0~6");
         int day = in.nextInt();
         switch(day) {
             case 0:
                 System.out.println(day + "表示是星期天");
                 break;
             case 1:
                 System.out.println(day + "表示是星期1");
                 break;
             case 2:
                 System.out.println(day + "表示是星期2");
                 break;
             case 3:
                 System.out.println(day + "表示是星期3");
                 break;
             case 4:
                 System.out.println(day + "表示是星期4");
                 break;
             case 5:
                 System.out.println(day + "表示是星期5");
                 break;
             case 6:
                 System.out.println(day + "今天是星期6");
                 default:
                     break;

         }












     }

}    
    
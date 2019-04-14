/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-14
 * Time: 22:21
 **/
public class Test4 {
    public static void main(String[] args) {
        /*int sum = 0;
        int i = 1;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println("累加和为："+sum);
    */


       /* int i = 1;
        int sum = 1;
        while(i<=10){
            sum = sum*i;
            i++;
        }
        System.out.println("结果为："+sum);
*/


        /*int i = 1;
        while (i <= 10000) {
            if (i % 2 == 1 && i % 3 == 2 && i % 5 == 4 && i % 6 == 5 && i % 7 == 0)
                System.out.println("这条阶梯最有：" + i);
                i++;
            }*/

        double m = 5000;//初始化存款额
        double s = m;//当前存款额
        int count = 0;//存款年数
        do{
            s = (1+0.0625)*s;
            count++;

        }while(s<2*m);{
            System.out.println(count+"年后连本带利翻一番");
        }


        }
    }
    
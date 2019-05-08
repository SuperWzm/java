/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-08
 * Time: 12:47
 **/

//P181
//返回斐波那契数列的第n项
public class Fibonacci {
   /* public static int f1(int n){
        if(n < 1){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return f1(n - 1) + f1(n - 2);
    }*/

   public static int f2(int n){
       if( n < 1){
           return 0;
       }
       if(n == 1 || n == 2){
           return 1;
       }
       int res = 1;
       int pre = 1;
       int temp = 0;
       for (int i = 3; i <= n ; i++) {
           temp = res;
           res = res + pre;
           pre = temp;
       }
       return res;
   }

    public static void main(String[] args) {

        System.out.println(f2(4));
    }
}    
    
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-18
 * Time: 22:55
 **/
public class Test3 {
    public static int fun(int num){
        int ret = 0;
        while(num!=0){
            ret = ret+(num%10)*(num%10);
            num = num/10;
        }
        return ret;
    }
    public static boolean isHappy(int n){
        if(n<=0){
            return false;
        }
        while(n!=1){
            n=fun(n);
            if(n==4){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-19
 * Time: 20:56
 **/
public class Test3 {
    public static int f(int n){
        if(n ==1 || n==2){
            return 1;
        }else{
            return f(n-1)+f(n-2);
        }

    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }


}    
    
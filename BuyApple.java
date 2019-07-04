import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-07-04
 * Time: 21:34
 **/
public class BuyApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    private static int solve(int n){
        int ans = 0;
        while(n >= 6){
            if(n % 8 == 0){
                ans = ans + (n >> 3);
                n = 0;
            }else{
                 n = n - 6;
                 ++ans;
            }
        }
        return  n == 0 ? ans :-1;
    }
}    
    
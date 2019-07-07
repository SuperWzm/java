import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-07-02
 * Time: 7:50
 **/
public class WaterBottel {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 0 || n == 1){
            System.out.println(0);
        }
        if(n == 2 || n == 3){
            System.out.println(1);
        }
        if(n == 4 || n == 5 || n == 6 || n == 7){
            System.out.println(2);
        }
        if(n > 7){
            while(n % 3 == 2){
                n = n / 3;
                sum = sum + n;
                System.out.println(sum+1);
            }
            while(n % 3 == 0){
                n = n / 3;
                sum = sum + n;
                System.out.println(sum);
            }
            while(n % 3 == 1){
                n = n / 3;
                sum = sum + n;
                System.out.println(sum+1);
            }
        }
    }

}    
    
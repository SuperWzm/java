import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-03
 * Time: 9:51
 **/
public class MeetingGifts {
    public static float count(int n){
        if(n == 1){
            return 0;
        }else if(n == 2){
            return 1;
        }else{
            return (n - 1)*(count(n-1)+count(n-2));
        }
    }
    public static float probability(int n){
        float result = 1;
        if(n == 0){
            return 1;
        }else if(n>0){
            result = n * probability(n-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            float result = (count(n)/probability(n)*100);
            System.out.println(String.format("%.2f",result)+"%");
        }
    }

}    
    
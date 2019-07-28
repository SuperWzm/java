import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-07-28
 * Time: 18:19
 **/
public class YiUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int b = scanner.nextInt();
            int a = scanner.nextInt();
            int[] n = new int[b];
            for (int i = 0; i < n.length; i++) {
                n[i] = scanner.nextInt();
            }
            for (int i = 0; i < n.length; i++) {
                if(a >= n[i]){
                    a+=n[i];
                }else{
                    a+=failure(n[i],a);
                }
            }
            System.out.println(a);
        }
    }
    public static int failure(int a,int b){
        while(a%b != 0){
            int temp = a%b;
            a= b;
            b = temp;
        }
        return b;
    }
}    
    
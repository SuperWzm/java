import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-05
 * Time: 15:21
 **/
public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        int count = s.length;
        int end = count;
        for (int i = count-1; i >0 ; i--) {
            if(' ' == s[i]){
                for (int j = i+1; j < end; j++) {
                    System.out.print(s[j]);
                }
                System.out.print(" ");
                end = i;
            }
        }
        for (int i = 0; i < end; i++) {
            System.out.print(s[i]);
        }
    }
}    
    
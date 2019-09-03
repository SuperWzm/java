import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-03
 * Time: 17:13
 **/
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = Integer.toBinaryString(num);
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}    
    
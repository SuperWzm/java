import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-30
 * Time: 21:34
 **/
public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        Scanner scanner1 = new Scanner(System.in);
        String B = scanner1.next();
        if (A.length() == 0 || B.length() == 0) {
            System.out.println("字符串为空");
        }
        int count = 0;
            for (int i = 0; i < A.length(); i++) {
                StringBuffer sb = new StringBuffer(A);
                StringBuffer str1 = sb.insert(i, B);
                String s1 = str1.toString();
                StringBuffer str2 = sb.reverse();
                String s2 = str2.toString();
                if (s1.equals(s2)) {
                    count++;
                }
            }
            System.out.println(count);
        }
}    
    
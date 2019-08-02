import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-01
 * Time: 14:19
 **/
public class ShouXingShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = a * a;
            String x1 = a + "";
            String x2 = b + "";
            if (x2.indexOf(x1) == x2.length() - x1.length()) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }
    }
}
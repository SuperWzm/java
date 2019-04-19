/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-19
 * Time: 21:14
 **/
public class Test5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= 6 ; i++) {
            System.out.print(a+"\t"+b+" ");
            a = a+b;
            b = a+b;
        }
    }
}    
    
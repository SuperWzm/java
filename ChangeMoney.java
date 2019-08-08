

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-07
 * Time: 16:45
 **/
public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g1 = scanner.nextInt();
        int s1 = scanner.nextInt();
        int k1 = scanner.nextInt();
        int g2 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int k2 = scanner.nextInt();
 //       System.out.println(g1+"."+s1+"."+k1+"  "+g2+"."+s2+"."+k2);
        int p = g1*17*19 + s1*19 +k1;
        int a = g2*17*19 + s2*19 +k2;
        if(p>a){
            a = p - a;
            System.out.println("-"+child(a));
            return;
        }
        a = a-p;
        System.out.println(child(a));
    }
    public static String child(int a){
        int g3,s3,k3;
        g3 = a/(17*19);
        s3 = a%(17*19)/19;
        k3 = a%19;
        String str = g3+"."+s3+"."+k3;
 //       System.out.println(g3+"." +s3+"."+k3);
        return str;
    }

}
    
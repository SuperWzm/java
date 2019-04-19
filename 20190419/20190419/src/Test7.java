/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-19
 * Time: 21:20
 **/
public class Test7 {
    public static void main(String[] args) {
        int num[] = new int[12];
        num[0] = 0;
        num[1] = 1;
        System.out.println("斐波那契数列前12项的值如下:");
        System.out.print(num[0]+" "+num[1]+" ");
        for (int i = 2; i <12 ; i++) {
            num[i] = num[i-1]+num[i-2];
            System.out.print(num[i]+" ");
        }
    }
}    
    
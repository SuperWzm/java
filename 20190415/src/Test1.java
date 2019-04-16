import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-15
 * Time: 8:47
 **/
public class Test1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("请输入1到3：");
       int  a = n.nextInt();

        Random random = new Random();
        int sum = random.nextInt(3)+1;
        switch(sum){
            case 1:
                System.out.println("啦啦啦");
                break;
            case 2:
                System.out.println("哈哈哈");
                break;
            case 3:
                System.out.println("嘎嘎嘎");
                break;


        }
    }
}    
    
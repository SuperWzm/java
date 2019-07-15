import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-07-15
 * Time: 14:20
 **/
public class Square {
    public static void function(int a,String c) {
        int tmp = a / 2;//行数实际上是列数的50%
        //四舍五入取整
        if (a % 2 != 0) {
            tmp = a / 2 + 1;
        }
        //当输入为4的时候只打印两行，每一行都是a个字符c
        if(tmp == 2){
            for (int i = 0; i < a; i++) {
                System.out.print(c);
            }
            System.out.println();
            for (int i = 0; i < a; i++) {
                System.out.print(c);
            }
        }else{
            //第一行打印一整行
            for (int i = 0; i < a; i++) {
                System.out.print(c);
            }
            System.out.println();
            //中间部分，每一行开始和结尾是字符c，中间是空格
            for (int i = 0; i < tmp-2; i++) {
                System.out.print(c);
                for (int j = 0; j < a-2; j++) {
                    System.out.print(" ");
                }
                System.out.print(c);
                System.out.println();
            }
            //最后一行打印一整行
            for (int i = 0; i < a; i++) {
                System.out.print(c);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String c = scanner.next();
        function(a, c);
    }
}    
    
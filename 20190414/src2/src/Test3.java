import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-14
 * Time: 22:13
 **/
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入性别代号(1,2,3)：");
        byte sex = in.nextByte();
        switch(sex){
            case 1:
                System.out.println("男性");
                break;
            case 2:
                System.out.println("女性");
                break;
                case 3:
                    System.out.println("未知");
                    break;

        }

    }

}    
    
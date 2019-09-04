import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-04
 * Time: 20:12
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char char1 = str.charAt(0);
        for (int i = 0; i < ch.length; i++) {
            if(char1 == ch[i]){
                count++;
                continue;
            }
            sb.append(char1).append(count);
            count = 1;
            char1 = str.charAt(i);
        }
        sb.append(char1).append(count);
        System.out.println(sb.toString());
    }
}    
    
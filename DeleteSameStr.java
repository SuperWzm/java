import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-17
 * Time: 18:50
 **/
public class DeleteSameStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if(str1 == null || str2 == null){
            System.out.println(str1);
        }else{
            for (int i = 0; i < str2.length(); i++) {
                int index = 0;
                while ((index = str1.indexOf(str2.charAt(i)))!= -1){
                    str1 = str1.substring(0,index) + str1.substring(index+1);
                }
            }
            System.out.println(str1);
        }
    }
}    
    
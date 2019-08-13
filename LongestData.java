import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-13
 * Time: 21:12
 **/
public class LongestData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= '0' && chars[i] <= '9'){
                count = 1;
                int index = i;
                for (int j = i+1; j < chars.length; j++) {
                    if(chars[j] >= 0 && chars[j] <= '9'){
                        count++;
                        index = j;
                    }else{
                        break;
                    }
                }if(count>result.length()){
                    result = str.substring(i,index+1);
                }
            }
        }
        System.out.println(result);
    }
}    
    
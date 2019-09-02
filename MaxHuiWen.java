import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-02
 * Time: 16:02
 **/
public class MaxHuiWen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            int i = 0;
            int j = str.length()-1;
            int end = j;
            while (i <= j){
                if(str.charAt(i) == str.charAt(j)){
                    i++;
                    j--;
                }else{
                    i = 0;
                    j--;
                    end = j;
                }
            }
            System.out.println(end+1);
        }
        sc.close();
    }
}
    
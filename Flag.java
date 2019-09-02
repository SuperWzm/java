import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-02
 * Time: 17:00
 **/
public class Flag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        while(sc.hasNext()){
            for (int i = 0; i < 3; i++) {
                str[i] = sc.nextLine();
            }
            System.out.println(fun(str[0],str[1],str[2]));
        }
    }

    public static String fun(String str,String a,String b){
        String re = ".*" + a + ".*" + b +".*";
        String str2 = new StringBuffer(str).reverse().toString();
        if(str.matches(re) && str2.matches(re))
            return "both";
        if(str.matches(re))
            return "forward";
        if(str2.matches(re))
            return "backward";
        return "invalid";
    }
}
    
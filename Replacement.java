

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-13
 * Time: 12:27
 **/
public class Replacement {
    public static String replaceSpace(String iniString, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = iniString.charAt(i);
            if(c == ' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return  sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("hello  my  world",16));
    }
}
    
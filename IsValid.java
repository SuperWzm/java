/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-04
 * Time: 21:40
 **/

//P273
//判断括号字符串的有效性
public class IsValid {
    public static boolean isValid(String str){
        if(str == null || str.equals("")){
            return false;
        }
        char[] ch = str.toCharArray();
        int status = 0;
        for (int i = 0; i < ch.length ; i++) {
            if(ch[i] != ')' && ch[i] != '('){
                return false;
            }
            if(ch[i] == ')' && --status < 0){
                return false;
            }
            if(ch[i] == '('){
                status++;
            }
        }
        return status == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(()())"));
        System.out.println(isValid("()("));
    }
}    
    
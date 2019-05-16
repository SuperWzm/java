/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-16
 * Time: 22:32
 **/
public class CountSegments {
    public static int countSegments(String s){
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += (s.charAt(i) != ' '&& (i+1 == s.length()||s.charAt(i+1) == ' ')) ? 1:0;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(countSegments("10,5,-3,3,2,null,11,3,-2,null,1"));
    }

}    
    
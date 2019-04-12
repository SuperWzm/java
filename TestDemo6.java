/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-12
 * Time: 23:59
 **/
public class TestDemo2 {
    public static int isNumeric(String str){
        char[] b =str.toCharArray();
        int count = 0;
       for(int i =0;i<b.length;i++){
           if(b[i]>=48&&b[i]<=57){
               count++;

           }
       }
       return count;
    }

    public static void main(String[] args) {
        String str = "abc21b416u";

        System.out.println(isNumeric(str));
    }
}    
    
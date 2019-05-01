import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-01
 * Time: 8:58
 **/
//P245
//给定一个字符串str和一个整数k，
// 如果str中正好有连续k个'0'字符出现时。
// 把k个连续的'0'字符去除，返回处理后的字符串。
public class RemoveKZeros {
    public static String removeKZeros(String str,int k){
        if(str == null || k < 1){
            return str;
        }
        char[] ch = str.toCharArray();
        int count = 0;
        int start = -1;
        for (int i = 0; i != ch.length ; i++) {
            if(ch[i] == '0'){
                count++;
                start = start == -1  ? i:start;
            }else{
                if(count == k){
                    while(count-- != 0){
                        ch[start++] =0;
                    }
                    count = 0;
                    start = -1;
                }
            }
            if(count == k){
                while(count-- != 0){
                    ch[start++] = 0;
                }
            }
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
         String str = "A000B";
         System.out.println(removeKZeros(str,3));
         String str1 = "ABC0000";
         System.out.println(removeKZeros(str1,4));
         String str2 = "AB0C";
         System.out.println(removeKZeros(str2,2));
     }
}    
    
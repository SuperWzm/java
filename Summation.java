import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-30
 * Time: 22:17
 **/

//P243
//给定一个字符串str，求其中全部数字串所代表的数字之和
public class Summation {
    public static int numsum(String str){
        if(str == null){
            return 0;
        }
        char[] charArray = str.toCharArray();
        int res = 0;
        int num = 0;
        boolean posi = true;
        int cur = 0;
        for (int i = 0; i < charArray.length ; i++) {
            cur = charArray[i] - '0';
            if(cur < 0 || cur >9){
                res += num;
                num = 0;
                if(charArray[i] == '-'){
                    if(i - 1 > -1 && charArray[i-1] == '-'){
                        posi = !posi;
                    }else{
                        posi = false;
                    }
                }else{
                    posi = true;
                }
            }else{
                num = num * 10 + (posi ? cur : -cur);
            }
        }
        res += num;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numsum("A1CD2E33"));
        System.out.println(numsum("A-1B--2C--D6E"));
        System.out.println(numsum("A1.3"));
    }
}    
    
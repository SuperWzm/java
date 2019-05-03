/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-03
 * Time: 9:26
 **/
//P266
//数组中两个字符串的最小距离
public class MinDistance {
    public static int midDistance(String[] strings,String str1,String str2){
        if(str1 == null || str2 == null){
            return -1;
        }
        if(str1.equals(str2)){
            return 0;
        }
        int last1 = -1;
        int last2 = -1;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i != strings.length ; i++) {
            if(strings[i].equals(str1)){
                min = Math.min(min,last2 == -1 ? min : i - last2);
                last1 = i;
            }
            if(strings[i].equals(str2)){
                min = Math.min(min,last1 == -1 ? min : i - last1);
                last2 = i;
            }
        }
        return min == Integer.MIN_VALUE ? -1 :min;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"1","3","3","3","2","3","1"};
        String str1 = "1";
        String str2 = "2";
        System.out.println(midDistance(strings,str1,str2));
    }
}    
    
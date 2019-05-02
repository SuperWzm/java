/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-02
 * Time: 21:53
 **/
//P255
//判断字符数组中是否所有的字符都只出现过一次
public class IsUnique {
    public static boolean isUnique1(char[] chars){
        if(chars == null){
            return true;
        }
        boolean[] map = new boolean[256];
        for (int i = 0; i < chars.length; i++) {
            if(map[chars[i]]){
                return false;
            }
            map[chars[i]] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        char[] array  =new char[]{'a','b','c'};
        char[] array0 = new char[]{'a','b','c','c'};
        char[] array1 = new char[]{'1','2','3'};
        char[] arary2 = new char[]{'1','2','2'};
        System.out.println(isUnique1(array));
        System.out.println(isUnique1(array0));
        System.out.println(isUnique1(array1));
        System.out.println(isUnique1(arary2));
    }
}    
    
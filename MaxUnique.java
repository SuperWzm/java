/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-06
 * Time: 8:55
 **/
//P284
//找到字符串的最长无重复子字符串
public class MaxUnique {
   public static int maxUnique(String str){
       if(str == null || str.equals("")){
           return 0;
       }
       char[] ch = str.toCharArray();
       int[] map = new int[256];
       for (int i = 0; i < 256 ; i++) {
           map[i] = -1;
       }
       int len = 0;
       int pre = -1;
       int cur = 0;
       for (int i = 0; i != ch.length ; i++) {
           pre = Math.max(pre,map[ch[i]]);
           cur = i - pre;
           len = Math.max(len,cur);
           map[ch[i]] = i;
       }
       return len;
   }

    public static void main(String[] args) {

        System.out.println(maxUnique("abcd"));
        System.out.println(maxUnique("aabcb"));
    }

}    
    
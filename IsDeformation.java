/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-30
 * Time: 21:42
 **/

//给定两个字符串str1和str2，
// 如果两个字符串中出现的字符
// 种类一样且每种字符出现的次数也一样，
// 那么str1和str2互为变形词
public class isDeformation {
    public static boolean isDeformation(String str1,String str2){
        if(str1 == null || str2 == null || str1.length() != str2.length()){
            return false;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int[] array = new int[256];
        for (int i = 0; i < ch1.length ; i++) {
            array[ch1[i]]++;
        }
        for (int i = 0; i < ch2.length ; i++) {
            if(array[ch2[i]]-- == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isDeformation("234","432"));
    }
}    
    
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-12
 * Time: 21:22
 **/
public class TestDemo1 {
    public static String stringCompress(String str) {
        StringBuilder a = new StringBuilder();
        char[] b = str.toCharArray();
        char char1 = str.charAt(0);
        int count = 1;
        for (int i = 1; i < b.length; i++) {
            if (char1 == str.charAt(i)) {
                count++;
                continue;
            }
            a = a.append(char1).append(count);
            count = 1;
            char1=str.charAt(i);
            }
        a = a.append(char1).append(count);
        return a.toString();
        }
        public static void main(String[] args) {
        String str = "aabbccdaa";
        stringCompress(str);
        System.out.println(stringCompress(str));
    }
}








/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-05
 * Time: 11:17
 **/
//字符串相加
public class AddStrings {
    public static String addStrings(String str1 , String str2){
        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int carry = 0;
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        StringBuilder s = new StringBuilder();
        while(i >= 0 || j >= 0 || carry == 1){
            int a = i >= 0 ? (array1[i--] - '0') : 0;
            int b = j >= 0 ? (array2[j--] - '0') : 0;
            int sum = a + b + carry;
            s.insert(0,sum%10);
            carry = sum / 10;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("1","5"));
    }
}    
    
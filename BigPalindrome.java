/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-17
 * Time: 17:23
 **/

//三位数最大回文乘积 例如：两位数最大是91*99=9009
public class BigPalindrome {

    public static int bigPalindrome(){
        int num = 0;
        for (int i = 999; i >0 ; i--) {
            for (int j = 999; j > 0 ; j--) {
                int product = i * j;
                if(product>num && palindrome(product))
                    num = product;
            }
        }
        return num;
    }

    private static boolean palindrome(int num){
        int bitCount = 0;
        int bit[] = new int[10];
        while(num != 0){
            bit[bitCount++] = num % 10;
            num /= 10;
        }
        for (int i = 0; i < bitCount >> 1; i++) {
            if(bit[i] != bit[bitCount - i - 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(bigPalindrome());
    }
}    
    
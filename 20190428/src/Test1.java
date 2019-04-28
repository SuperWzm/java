/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-28
 * Time: 11:13
 **/

//打印最长回文串，例如输入“abccccdd”，输出7，
// 因为可以构造的最长回文串是“dccaccd”。
public class Test1 {
public static int longestPalindrome(String s){
        int[] freq = new int [256];
        int count = 0;
        for(char ch : s.toCharArray()){
            freq[ch - 'A']++;
            if(freq[ch - 'A'] ==2){
                count += 2;
                freq[ch-'A'] = 0;
            }
        }
        if(count <s.length())
            count +=1;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}

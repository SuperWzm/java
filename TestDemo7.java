/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-13
 * Time: 0:33
 **/
public class TestDemo3 {

    public static String reverseSentence(String str) {
        char[] a = str.toCharArray();
        char[] b = new char[a.length];
        int len = a.length;
        for (int i = 0; i < len; i++) {
            b[len - 1 - i] = a[i];
        }
        int count = 0;
        char[] c = b.clone();
        for (int i = 0; i < b.length; i++) {
            if (b[i] !=' ') {
                count++;
            } else {
                int k = 0;
                for (int j = i - count; j < i; j++) {
                    if (k < count) {
                        c[j] = b[i - 1 - k];
                        k++;
                    }
                }
                count = 0;
            }
        }
        String d = new String(c);
        return d;
    }

    public static void main(String[] args) {
        System.out.println(reverseSentence("i am biter"));
    }
}






    
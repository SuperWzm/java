/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-30
 * Time: 19:56
 **/
public class FindMaxCountData2 {
    public static void main(String[] args) {
        int[] a = new int[]{2,3,1,2,2,5,6,8,2,3,2,4,2};
        int[] b = new int[13];
        for (int i = 0; i < a.length; i++) {
            b[a[i]]++;
        }
        int max = b[0];
        int value = 0;
        for (int i = 0; i < b.length; i++) {
            if(b[i] > max){
                max = b[i];
                value = i;
            }
        }
        System.out.println("出现次数最多的值是" + value);
        System.out.println("出现次数" + max);
    }
}    
    
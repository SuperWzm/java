import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-02
 * Time: 18:19
 **/
public class ReverseArraySort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int length = sc.nextInt();
            int[] arr = new int[length];
            int[] copy = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
                copy[i] = arr[i];
            }
            Arrays.sort(copy);
            int left = 0;
            int right = length-1;
            while (left<length && arr[left] == copy[left]){
                left++;
            }
            while (right>0 && arr[right] == copy[right]){
                right--;
            }
            int i = 0;
            for ( i = 0; i <= right-left; i++) {
                if (arr[left + i] != copy[right - i]) {
                    break;
                }
            }
                if(i>right-left){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
        }
    }
}    
    
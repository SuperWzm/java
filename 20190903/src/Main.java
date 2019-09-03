/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-03
 * Time: 16:43
 **/
import java.util.*;

public class Main {
    public static void main(String[] args) {
            int[] arr = new int[]{1,-1,2,3,4,-2};
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]+arr[j] ==0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
}
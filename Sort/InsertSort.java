package Sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-10-02
 * Time: 15:55
 **/
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {2,4,1,9,5,7,6};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = 0;
            for (j = i-1; j >= 0;j--) {
                if(array[j] > temp){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = temp;
        }
    }
}    
    
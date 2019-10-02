package Sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-10-01
 * Time: 21:57
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1232, 5, 2, 5, 5, 1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}    
    
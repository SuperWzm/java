package Sort;


import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-10-02
 * Time: 9:46
 **/
public class SelectSort {
    public static void main(String[] args) {
        int[] array = {11,4,2,5,7,23,13,4,6};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }
}

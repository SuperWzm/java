package Sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-10-05
 * Time: 17:27
 **/
public class Quick {
    public static void main(String[] args) {
        int[] array = {9,3,2,4,6,7,2,5};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array,int left,int right){
        if(left > right){
            return;
        }
        int base = array[left];
        int i = left;
        int j = right;
        while (i != j){
            while (array[j] >= base && i<j){
                j--;
            }
            while(array[i] <= base && i<j){
                i++;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        array[left] = array[i];
        array[j] = base;
        sort(array,left,i-1);
        sort(array,j+1,right);
    }
}    
    
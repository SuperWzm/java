package Sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-10-02
 * Time: 8:07
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 6, 4, 3, 7, 2, 8, 2, 9, 0, 1};
        quick(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quick(int[] array,int left,int right){
        if(left > right){
            return ;
        }
        int base = array[left];
        int i = left;
        int j = right;
        while(i != j){
            while(array[j] >= base && i<j){
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
        quick(array,left,i-1);
        quick(array,j+1,right);
    }

}    
    
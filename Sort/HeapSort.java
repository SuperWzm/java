package Sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-10-02
 * Time: 10:38
 **/
public class HeapSort {
        public static void main(String[] args) {
            int[] arr = new int[]{9, 6, 8, 7, 0, 1, 10, 4, 2};
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
        //构造大根堆
        public static void maxHeap(int[] array,int size,int index){
            int leftNode = 2*index+1;
            int rightNode = 2*index+2;
            int max = index;
            if(leftNode < size && array[leftNode] > array[max]){
                max = leftNode;
            }
            if(rightNode < size && array[rightNode] > array[max]){
                max = rightNode;
            }
            if(max != index){
                int temp = array[index];
                array[index] = array[max];
                array[max] = temp;
                maxHeap(array,size,max);
            }
        }

        public static void sort(int[] array){
            int start = (array.length-1)/2;
            for (int i = start; i >= 0; i--) {
                maxHeap(array,array.length,i);
            }
            for (int i = array.length-1; i > 0; i--) {
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;
                maxHeap(array,i,0);
            }
        }
}    
    
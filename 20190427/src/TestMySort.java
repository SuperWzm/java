import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.u
 * Description:
 * User: wang
 * Date: 2019-04-27
 * Time: 11:36
 **/
public class TestMySort {
    //直接插入排序越有序越快
    public static void insertSort(int[] array) {
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = 0;
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > temp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = temp;
        }
    }

    //希尔排序
    //进行直接插入排序
    public static void shell(int[] array, int gap) {
        int temp = 0;
        for (int i = gap; i < array.length; i++) {
            temp = array[i];
            int j = 0;
            for (j = i - gap; j < array.length; j-=gap) {
                if (array[j] > temp) {
                    array[j + gap] = array[i];
                } else {
                    break;
                }
            }
            array[j + gap] = temp;
        }
    }

    public static void shellSort(int[] array) {
        int[] drr = {5, 3, 1};
        for (int i = 0; i <array.length ; i++) {
            shell(array,drr[i]);
        }
    }


    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = 0;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //一次调整的时间复杂度是多少？
    public static void adjust(int[] array,int start,int end){
        int temp = array[start];
        for (int i = 2*start+1; i <= end ; i = i*2+1) {
            //先找到左右孩子的最大值下标
            if(i<end && array[i]<array[i+1]){
                i++;//找到了左右孩子最大值
            }
            if(array[i]>temp){
                    array[start] = array[i];
                    start = i;
                }else if(array[i]<temp){
                    //array[start] = temp;
                    break;
            }
        }
        array[start] = temp;

    }

    public static void heapSort(int[] array){
        for (int i = (array.length-1-1)/2; i >=0 ; i--) {
            adjust(array,i,array.length-1);//log2n
        }
        //整棵树调整为大根堆的时间复杂度？==》nlog2n
        //交换
        for (int j = 0; j <array.length-1 ; j++) {
            int temp = array[array.length-1-j];
            array[array.length-1-j] = array[0];
            array[0] = temp;
            //array.length-1-j-1  第二个-1是因为最后一个已经排好序，
            // 交换过不需要再调整
            adjust(array,0, array.length-1-j-1);
        }
    }



    public static int partion(int[] array,int low,int high) {
        int temp = array[low];
        while (low < high) {
            while ((low < high) && array[high] >= temp) {
                high--;
            }
            if (high >= low) {
                break;
            } else {
                array[low] = array[high];
            }
        }
        while (low < high) {
            while ((low < high) && array[low] <= temp) {
                low++;
            }
            if (low >= high) {
                break;
            } else {
                array[high] = array[low];
            }

        }
        array[low] = temp;
        return low;
    }

    public static void insertSort(int[] array,int start,int end) {
                int temp = 0;
                for (int i = start + 1; i <= end; i++) {
                    temp = array[i];
                    int j = 0;
                    for ( j = i - 1; j >= start; j--) {
                        if (array[j] > temp) {
                            array[j + 1] = array[j];
                        } else {
                            break;
                        }
                    }
                    array[j+1] = temp;
                 }
    }

    public static void quick(int[] array,int start,int end){

        if(end-start+1 <= 16){
            insertSort(array,start,end);
            return;
        }

        int par = partion(array,start,end);
        //找左边是否有两个数据以上
        if(par > start+1){
            quick(array,start,par-1);
        }
        //右边是否有两个数据以上
        if(par < end-1){
            quick(array,par+1,end);
        }

    }
    public static void quickSort(int[] array){
                quick(array,0,array.length-1);
            }


    public static void main(String[] args) {
        int[] array = {12, 4, 8, 2, 9, 1, 3};

/*       Random random = new Random();
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000)+1;
        }*/

        quickSort(array);
        System.out.println(Arrays.toString(array));

    /*    selectSort(array);
        System.out.println(Arrays.toString(array));*/
/*
        insertSort(array);
        System.out.println(Arrays.toString(array));
*/
    }
}
    
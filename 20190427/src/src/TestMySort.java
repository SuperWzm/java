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
  /*  public static void insertSort(int[] array) {
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
    }*/

public static void insertSort(int[] array){
    int temp = 0;
    for (int i = 1; i <array.length ; i++) {
        temp = array[i];
        int j = 0;
        for (j = 0; j >= 0 ; j--) {
            if(array[j] > temp){
                array[j+1] = array[j];
            }else{
                break;
            }
        }
        array[j+1] = temp;
    }
}

    //希尔排序
    // 先分组，组内进行直接插入排序
   /* public static void shell(int[] array, int gap) {
        int temp = 0;
        for (int i = gap; i < array.length; i++) {
            temp = array[i];
            int j = 0;
            for (j = i - gap; j >=0; j-=gap) {
                if (array[j] > temp) {
                    array[j + gap] = array[j];
                } else {
                    break;
                }
            }
            array[j + gap] = temp;
        }
    }*/

    public static void shell(int[] array, int gap) {
        int temp = 0;
        for (int i = gap; i <array.length ; i++) {
            temp = array[i];
            int j = 0;
            for (j = j-gap; j >= 0 ; j-=gap) {
                if(array[j]>temp){
                    array[j+gap] = array[j];
                }else{
                 break;
                }
            }
            array[j+gap] = temp;
        }

    }

  /*  public static void shellSort(int[] array) {
        int[] drr = {5, 3, 1};
        for (int i = 0; i <drr.length ; i++) {
            shell(array,drr[i]);
        }
       *//* long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        System.out.println(end-start);*//*
    }
*/

    public static void shellSort(int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length ; i++) {
            shell(array,drr[i]);
        }
    }
    //选择排序
 /*   public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < array[i]) {
                        int temp = 0;
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
            }
        }
    }
*/

    public static void selectSort(int[] array) {
       int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
    }
    //一次调整的时间复杂度是多少？O(log2N)
 /*   public static void adjust(int[] array,int start,int end){
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

    }*/
    public static void adjust(int[] array,int start,int end){
        int temp = array[start];
        for (int i = start*2+1; i <= end ; i= 2*i+1) {
            if(i<end && array[i] <array[i+1]){
                i++;
            }
            if(array[i]>temp){
                array[start] = array[i];
                start = i;
            }else{
                break;
            }
        }
        array[start] = temp;
    }

    //堆排序
  /*  public static void heapSort(int[] array){
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
    }*/

    public static void heapSort(int[] array){
        for (int i = (array.length-1-1)/2; i >=0 ; i--) {
            adjust(array,i,array.length-1);
        }
        for (int j = 0; j <array.length-1 ; j++) {
            int temp = array[array.length-1-j];
            array[array.length-1-j] = array[0];
            array[0] = temp;
            adjust(array,0,array.length-1-j-1);
        }
    }

     //快速排序
  /*  public static int partion(int[] array,int low,int high) {
        int temp = array[low];
        while (low < high) {
            while ((low < high) && array[high] >= temp) {
                high--;
            }
            //切记 low 和 high 是下标
            if (low >= high) {
                break;
            } else {
                array[low] = array[high];
            }
            while ((low < high) && array[low] <= temp) {
                low++;
            }
            //切记 low 和 high 是下标
            if (low >= high) {
                break;
            } else {
                array[high] = array[low];
            }
        }
            array[low] = temp;
            return low;
    }*/

    public static int partion(int[] array,int low,int high) {
        int temp = array[low];
        while(low<high){
            while(low<high && array[high] >= temp){
                high--;
            }
            if(low >= high){
                break;
            }else{
                array[low] = array[high];
            }
            while(low<high && array[low] <=temp){
                low++;
            }
            if(low>=high){
                break;
            }else{
                array[high] = array[low];
            }
        }
        array[low] = temp;
        return low;
    }

    // 第一种：用insert对快排的优化
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

    public static void swap(int[] array,int start,int end){
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

    //第二种：三数取中法进行快排的优化
    public static void medianOfThree(int[] array,int low,int high){
        int mid = (low+high)>>>1;
        // array[mid]<=array[low]<=array[high]
        if(array[mid] > array[low]){
            swap(array,mid,low);
        }
        if(array[mid] >array[high]){
            swap(array,mid,high);
        }
        if(array[low] >array[high]){
            swap(array,low,high);
        }

    }

    public static void quick(int[] array,int start,int end){

        if(end-start+1 <= 16){
            insertSort(array,start,end);
            return;
        }

        //优化2调用:三数取中法
        medianOfThree(array,start,end);


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
    //快速排序
    public static void quickSort1(int[] array){
                quick(array,0,array.length-1);
            }

            //非递归实现排序
    public static void quickSort(int[] array) {
        int[] stack = new int[array.length * 2];
        int top = 0;
        int low = 0;
        int high = array.length - 1;
        //先进行一趟快速排序
        int par = partion(array, low, high);
        //第一步要判断当前par左右两边是否有两个数据以上
        if (par > low + 1) {
            stack[top++] = low;
            stack[top++] = par - 1;
        }
        if (par < high - 1) {
            stack[top++] = par + 1;
            stack[top++] = high;
        }
        //以上代码执行完毕，两边的数对已经全部入栈
        //下面判断栈是否为空，不为空，取出两个数对
        //然后再调用partion()
        while (top > 0) {
            high = stack[--top];
            low = stack[--top];
           par = partion(array, low, high);

            if (par > low + 1) {
                stack[top++] = low;
                stack[top++] = par - 1;
            }
            if (par < high - 1) {
                stack[top++] = par + 1;
                stack[top++] = high;
            }
        }
    }

    public static  void merge(int[] array,int start,int mid,int end){
        int[] tempArray = new int[array.length];
        int tempIndex = start;

        int start2 = mid+1;
        int i = start;
        //两个归并段都有数据的时候
        while(start <= mid && start2 <= end){
            if(array[start] <= array[start2]){
                tempArray[tempIndex++] = array[start++];
            }else{
                tempArray[tempIndex++] = array[start2++];
            }
        }
        while(start <= mid){
            tempArray[tempIndex++] = array[start++];
        }
        while (start2 <= end){
            tempArray[tempIndex++] = array[start2++];
        }

        while (i <= end){
            array[i] = tempArray[i];
            i++;
        }
        System.out.println(Arrays.toString(array));

    }

    //归并排序
    public static void mergeSort(int[] array,int start,int end ){
        if(start >= end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(array,start,mid);//递归左边
        mergeSort(array,mid+1,end);//递归右边A
        //肯定是一个一个的有序序列

        merge(array,start,mid,end);
    }

    public static void main(String[] args) {
      int[] array = {49,38,65,97,76,13,27,49};
      /*quickSort(array);
        System.out.println(Arrays.toString(array));*/


        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));


      /* Random random = new Random();
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000)+1;
        }
        quickSort(array);
        System.out.println(Arrays.toString(array));*/

      /*  heapSort(array);
        System.out.println(Arrays.toString(array));*/


       /* shellSort(array);
        System.out.println(Arrays.toString(array));*/

      /*  quickSort(array);
        System.out.println(Arrays.toString(array));*/

       /* selectSort(array);
        System.out.println(Arrays.toString(array));*/

      /*  insertSort(array);
        System.out.println(Arrays.toString(array));*/

    }
}
    
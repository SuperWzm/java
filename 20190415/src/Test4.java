import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-16
 * Time: 10:15
 **/
//冒泡排序最优化代码
public class Test4 {
    public static void bubbleSort(int[] array) {
        for(int i = 0;i<array.length-1;i++){
            boolean swap = false;
            for(int j = 0;j<array.length-1-i;j++){
               if(array[j]>array[j+1]){
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
                   swap =true;
               }
            }
            if(!swap){
                break;
            }
        }

    }

    public static void main(String[] args) {
        int [] array = {12,4,8,6,3,5,2,};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }
}
    
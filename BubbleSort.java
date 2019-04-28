import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-28
 * Time: 21:53
 **/
/*public class BubbleSort {
    public static void Bubble(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <array.length-i ; j++) {
                if(array[j-1]>array[j]){
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {6,25,34,9,12,55,56};
        Bubble(array);
        System.out.println(Arrays.toString(array));
    }
}    */


public class BubbleSort {
    public static void Bubble(int[] array){
        for (int i = 0; i < array.length; i++) {
            boolean f = false;
            for (int j = 1; j <array.length-i ; j++) {
                if(array[j-1]>array[j]){
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    f = true;
                }
            }
            if(!f){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {6,25,34,9,12,55,56};
        Bubble(array);
        System.out.println(Arrays.toString(array));
    }
}
    
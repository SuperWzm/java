package Sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-10-02
 * Time: 16:26
 **/
public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6};
        int[] arr2 = {1, 3,5};
        int[] res = merge(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }
    public static int[] merge(int[] arr1,int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] res = new int[len1 + len2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<len1 && j<len2){
            res[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        }
        while (i < len1){
            res[k++] = arr1[i++];
        }
        while (j < len2){
            res[k++] = arr2[j++];
        }
        return res;
    }
}
    
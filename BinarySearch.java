package Sort;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-10-05
 * Time: 17:57
 **/

//二分查找
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int index = binarySearch(array,5);
        System.out.println(index);
    }

    public static int binarySearch(int[] array,int item){
        int left = 0;
        int right = array.length-1;
        int index = -1;
        while(left <= right){
            int mid = (left+right)/2;
            int guess = array[mid];
            if(guess == item){
                return mid;
            }
            if(guess > item){
                left = 0;
                right = mid-1;
            }
            if(guess < item){
                left = mid+1;
                right = array.length-1;
            }
        }
        return index;
    }
}    
    
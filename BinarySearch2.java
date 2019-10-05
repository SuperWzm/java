package Sort;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-10-05
 * Time: 18:09
 **/

//二分查找 第二种：用递归
public class BinarySearch2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int index = binarySerch(array,7,0,array.length-1);
        System.out.println(index);
    }

    public static int binarySerch(int[] array,int item,int left,int right){
        int mid = (left + right) / 2;
        int guess = array[mid];
        int index = -1;
        if(guess == item){
            return mid;
        }
        if(guess > item){
            index = binarySerch(array,item,left,mid-1);
        }
        if(guess < item){
            index = binarySerch(array,item,mid+1,right);
        }
        return index;
    }
}    
    
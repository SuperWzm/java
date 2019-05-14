/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-14
 * Time: 14:11
 **/
//未排序正数数组中累加和为k的最长子数组长度
//P355

public class GetMaxLength {

    public static int getMaxLength(int[] array,int k){
        if(array == null || array.length == 0){
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = array[0];
        int len = 0;
        while(right<array.length){
            if(sum == k){
                len = Math.max(len,right - left + 1);
                sum -= array[left++];
            }else if(sum < k){
                right++;
                if(right == array.length){
                    break;
                }
                sum += array[right];
            }else{
                sum -= array[left++];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] array =  new int[]{1,2,1,1,1};
        getMaxLength(array,3);
        System.out.println(getMaxLength(array,3));
    }
}    
    
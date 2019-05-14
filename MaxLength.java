import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-14
 * Time: 14:18
 **/
//数组值可正，可负，可0，求给定累加和为k的最长子数组长度
//P358
public class MaxLength {

    public static int maxLength(int[] array,int k){
        if(array == null || array.length == 0){
            return 0;
        }
        HashMap < Integer,Integer > map = new HashMap<Integer,Integer>();
        map.put(0,-1);
        int len = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if(map.containsKey(sum - k)){
                len = Math.max(i - map.get(sum - k),len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-1,3,3,4};
        System.out.println(maxLength(array,2));
    }
}    
    
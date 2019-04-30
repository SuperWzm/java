import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-30
 * Time: 13:11
 **/
//给一个非空数组，返回数组中第三大的数，如果不存在，则返回数组中最大的数，要求算法时间复杂度O(N).
public class ThirdBiggestCount {
public static int thireMax(int[] array){
    Integer max1 = null;//最大数
    Integer max2 = null;
    Integer max3 = null;//最小数
    for(Integer n:array){
        if(n.equals(max1) || n.equals(max2) ||n.equals(max3))
            continue;
        if(max1 == null || n>max1){
            max3 = max2;
            max2 = max1;
            max1 = n;
        }else if(max2 == null ||n>max2){
            max3 = max2;
            max2 = n;
        }else if(max3 ==null || n>max3){
            max3 = n;
        }
    }
    return max3 == null? max1:max3;
}

    public static void main(String[] args) {
    int[] array = {1,3,2};
    thireMax(array);
        System.out.println(thireMax(array));
    }
}    
    
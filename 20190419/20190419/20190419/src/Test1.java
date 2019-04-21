/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-19
 * Time: 9:32
 **/
public class Test1 {
    public static int[] fun(int[] nums,int target ) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        int ch[] =new int[]{i,j};
                        return ch;
                    }
                }
            }
            return null;
        }


    public static void main(String[] args) {
        System.out.println(fun(new int[]{1, 2, 4, 5},3));

    }
}

    
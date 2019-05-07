/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-07
 * Time: 15:52
 **/
//P235
//跳跃游戏
public class JumpGame {
    public static int jump(int[] array){
        if(array == null || array.length == 0){
            return 0;
        }
        int jump = 0;
        int cur = 0;
        int next = 0;
        for (int i = 0; i < array.length; i++) {
            if(cur < i){
                jump++;
                cur = next;
            }
            next = Math.max(next,i + array[i]);
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,2,1,1,4};
        System.out.println(jump(array));
    }
}    
    
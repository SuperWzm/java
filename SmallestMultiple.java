/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-17
 * Time: 17:34
 **/

//最小倍数：最小的能被1到20整除的正数是多少？
public class SmallestMultiple {

    public static int smallestMultiple(int num){
        int count = num * (num-1);
        int m = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            m = count * i;
            for (int j = 2; j <= num ; j++) {
                if(m % j != 0){
                    break;
                }
                if(j == num){
                    return m;
                }

            }
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(smallestMultiple(20));
    }
}    
    
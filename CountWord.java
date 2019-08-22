/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-22
 * Time: 19:14
 **/
public class CountWord {
    public int MoreThanHalfNum_Solution(int[] array) {

        int length = array.length;
        int result = array[0];
        int times = 1;
        for (int i = 1; i < length; i++) {
            if (times == 0) {
                result = array[i + 1];
                times = 1;
            } else if (array[i] == result) {
                times++;
            } else if (array[i] != result) {
                times--;
            }
        }
        times = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == result) {
                times++;
            }
        }
        if (times > length / 2) {
            return result;
        } else
            return 0;
    }
}    
    
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-05
 * Time: 22:19
 **/
public class TestDemo4 {
    public static void main(String[] args) {
        int[] array = {1, 23, 4, 15, 6, 7, 8, 9};
        int[] array2 = new int[array.length];
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }


        array2[0] = 33;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
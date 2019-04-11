import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-04
 * Time: 23:35
 **/
/*拷贝*/
public class TestDemo2 {

    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,8,9};
        int[] array2 =new int[array.length];
        System.out.println("array2:"+array2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        array2=Arrays.copyOf(array,array.length);
        System.out.println("array2:"+array2);
        array2[0]=223;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

    }
}
    
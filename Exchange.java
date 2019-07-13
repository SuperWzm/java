import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-07-13
 * Time: 20:25
 **/
public class Exchange {

    public static int[] exchangeAB(int[] AB) {
        AB[0] = AB[0] ^ AB[1]; //0011
        AB[1] = AB[1] ^ AB[0]; //0001
        AB[0] = AB[0] ^ AB[1]; //0010
        return AB;
    }
    public static void main(String[] args) {
        int[] AB = {1,2};
        System.out.println(Arrays.toString(exchangeAB(AB)));
    }
}    
    
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-06
 * Time: 22:50
 **/
/*public class TestVarArgs {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{}));
        System.out.println(sum(new int[]{1,2}));
        System.out.println(sum(new int[]{1,2,3}));
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int sum(int[] data){
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

}    */


public class TestVarArgs {
    public static void main(String[] args) {
        System.out.println(sum());//0
        System.out.println(sum(1,2));//3
        System.out.println(sum(1,2,3));//6
    }

    public static int sum(int... data){
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }
     }

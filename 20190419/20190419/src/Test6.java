/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-19
 * Time: 21:16
 **/
public class Test6 {
    public static void main(String[] args) {
        int[] array = new int[12];
        array[0] = 1;
        array[1] = 1;
        for (int i = 0; i <array.length ; i++) {
            if(i>1){
                array[i] = array[i-1]+array[i+2];
            }
            System.out.print(array[i]+"\t");
        }
    }

}    
    
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-06
 * Time: 23:26
 **/
public class TestFor {
    public static void main1(String[] args) {
        int[] data = new int[] {1,2,3,4,5};
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,4,5};
        for(int i : data){
            System.out.println(i);
        }
    }
}    
    
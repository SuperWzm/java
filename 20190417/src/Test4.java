/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-17
 * Time: 13:25
 **/
/*public class Test4 {
    public static void main(String[] args) {
        int[] array = new int[] {1,3,6,4,2};
       int  [] array1 ={1,3,4,2,5};
        System.out.println(array[4]);
        System.out.println(array1[2]);
        for(int i =0;i<array.length;i++){
            System.out.println("array["+i+"]="+array[i]);
        }
    }
}    */

public class Test4 {
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }



        public static void main(String[] args) {
            int[] array = new int[]{1, 8, 2, 5, 4, 7, 0};
            int max = getMax(array);
            System.out.println("Max=" + max);

        }

    }

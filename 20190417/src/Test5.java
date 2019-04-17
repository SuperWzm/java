/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-17
 * Time: 13:44
 **/
public class Test5 {
    public static void selectSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{4,2,7,5,1,9,0,3};
        for(int i = 0;i<array.length;i++){
            System.out.println("array["+i+"]="+array[i]);
        }
        System.out.println();
                selectSort(array);
                for(int i =0;i<array.length;i++){
                    System.out.println("array["+i+"]"+array[i]);
                }
    }
}    
    
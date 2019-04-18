/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-18
 * Time: 23:06
 **/
public class Test5 {
    public static int fun(int n){
        int[] array = new int [n];
        for (int i = 0; i <array.length ; i++) {
            array[i] = 1;
        }
        int count = 0;
        int num = n;
        while(num>1){
            for (int i = 0; i <n ; i++) {
                if(array[i]==1){
                    count++;
                    if(count==3){
                        array[i]=0;
                        num--;
                        count =0;
                    }
                }

            }
        }
        for (int i = 0; i <n ; i++) {
            if(array[i]==1){
                return i+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(fun(6));
    }
}    
    
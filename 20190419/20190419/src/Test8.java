/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-19
 * Time: 21:26
 **/
public class Test8 {
    public static void main(String[] args) {
        int j =0;
        boolean flag;
        for (int i = 2; i <10000 ; i++) {
            flag = false;
            for ( j = 2; j <i ; j++) {
                if(i%j ==0){
                    flag = true;
                    break;
                }
            }
            if(flag = false){
                System.out.print(i+" ");
            }
        }
    }
}    
    
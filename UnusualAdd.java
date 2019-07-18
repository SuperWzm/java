import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-07-18
 * Time: 19:48
 **/
public class UnusualAdd {

    public int addAB(int A, int B) {
        // write code here
        int temp;
        do{
            temp = A & B;
            A = A ^ B;
            B = temp << 1;
        }while(B != 0);
        return A;
    }
}    
    
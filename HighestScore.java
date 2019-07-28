import com.sun.javafx.tk.ScreenConfigurationAccessor;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-07-28
 * Time: 18:34
 **/
public class HighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] score = new int[N];
            for (int i = 0; i < N; i++) {
                score[i] = scanner.nextInt();
            }
            for (int i = 0; scanner.hasNext()&&i<M; i++) {
                char c= scanner.next().toCharArray()[0];
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                opeartor(score,c,A,B);
            }
        }

    }
    public static void opeartor(int[] score,char c, int a,int b){
        if(c == 'Q'){
            int begin = (a < b ? a :b) - 1;
            int end = a > b ? a :b;
            int max = score[begin];
            for (int i = begin; i < end; i++) {
                if(score[i] > max){
                    max = score[i];
                }
            }
            System.out.println(max);
        }else if(c == 'U'){
            score[a-1] = b;
        }
    }
}    
    
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-23
 * Time: 23:10
 **/
import java.util.Scanner;

public class HeChangTuan {
    public static void main(String[] args) {
        //键盘输入
		/*
		int n=6;
		int[] nums={-7,4,5,2,-6,7};
		int k=3;
		int d=4;
		 */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //从键盘输入n值
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scan.nextInt();//从键盘输入能力值
        }
        int k = scan.nextInt();//从键盘输入选取的人数
        int d = scan.nextInt();//从键盘输入误差范围

        long[][] max = new long[k][n];
        long[][] min = new long[k][n];
        for(int i = 0; i < k; i++)
            for(int j = 0; j < n; j++){  //给二维数组赋初值
                max[i][j] = 1;
                if(i == 0){
                    min[i][j] = nums[j];
                    max[i][j] = nums[j];
                }
                //  System.out.println("-------------------");
                // System.out.println(max[i][j]+"   "+min[i][j]);
            }

        for(int i = 1; i < k; i++)
            for(int j = 0; j < n; j++)
                for(int m = 1; m <= d; m++){
                    if(j - m >= 0){
                        if(nums[j] > 0){
                            min[i][j] = Math.min(min[i][j], min[i - 1][j - m] * nums[j]);
                            max[i][j] = Math.max(max[i][j], max[i - 1][j - m] * nums[j]);
                        } else{
                            min[i][j] = Math.min(min[i][j], max[i - 1][j - m] * nums[j]);
                            max[i][j] = Math.max(max[i][j], min[i - 1][j - m] * nums[j]);
                        }
                    }
                }
        long Max = 0;
        for(int i = 0; i < n; i++){
            //System.out.println(max[k - 1][i]);
            //System.out.println(min[k - 1][i]);
            Max = Math.max(Max, max[k - 1][i]);
        }
        System.out.println(Max);
    }

}
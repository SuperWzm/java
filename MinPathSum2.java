/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-09
 * Time: 12:25
 **/
//P187
//矩阵的最小路径和
//从左上角开始每次只能向右或者向下走，最后到右下角，路上所有数字之和就是路径和。
public class MinPathSum2 {
    public static int minPathSum2(int[] [] m){
        if(m == null || m.length == 0 || m[0] == null || m[0].length == 0){
            return  0;
        }
        int more = Math.max(m.length,m[0].length);
        int less = Math.max(m.length,m[0].length);
        boolean rowmore = more == m.length;
        int[] array = new int[less];
        array[0] = m[0][0];
        for (int i = 1; i < less; i++) {
            array[i] = array[i-1] + (rowmore ? m[0][i] : m[i][0]);
        }
        for (int i = 1; i < more ; i++) {
            array[0] = array[0] + (rowmore ? m[i][0] : m[0][i]);
            for (int j = 1; j < less; j++) {
                array[j] = Math.min(array[j-1],array[j]) + (rowmore ? m[i][j] : m[j][i]);
            }
        }
        return array[less-1];
    }

    public static void main(String[] args) {
        int[][] m = {{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
        System.out.println(minPathSum2(m));
    }
}    
    
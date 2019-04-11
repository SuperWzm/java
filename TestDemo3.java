/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-05
 * Time: 11:11
 **/
/*数组排序*/
public class TestDemo3 {
    public static void main(String[] args) {
        int[][] person=new int[][]{{1,2},{3,4},{5,6},{7,8,9}};
       for(int x=0;x<person.length;x++){
            for(int y=0;y<person[x].length;y++){
               System.out.println("person["+x+"]["+y+"]="+person[x][y]+".");
            }
            System.out.println();
        }

    }
}    
    
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-14
 * Time: 10:17
 **/
public class TestDemo3 {
   /* public static void main(String[] args)throws Exception {

            System.out.println(calculate(10,0));
    }
    public  static int calculate(int x,int y)throws Exception{
        return x/y;
    }*/

    public static void main(String[] args) {
        try{
            throw new Exception("抛个异常玩玩");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}    
    
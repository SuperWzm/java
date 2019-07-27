import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-07-27
 * Time: 11:21
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        System.out.println(test());
        System.out.println(test2());
    }
    public static int test(){
        int a = 0;
        try{
            a= 1;
            return a;
        }catch (Exception e){
            a = 2;
            return a;
        }finally {
            a = 3;
      //      return a;
        }
    }
    public static List<Integer> test2(){
        List<Integer> list = new ArrayList<>();
        try{
            list.add(1);
           return list;
        }catch(Exception e){
            list.set(0,2);
            return list;
        }finally {
            list.set(0,3);
        }
    }
}    
    
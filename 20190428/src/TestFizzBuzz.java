import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-28
 * Time: 11:30
 **/

//输入1到n数字的字符串表示：
// 1丶如果n是3的倍数，输出"Fizz";
// 2丶如果n是5的倍数，输出"Buzz";
// 3丶如果n同时是3和5的倍数，输出"FizzBuzz"；
// 4丶如果都不是，输出数字本身；
public class TestFizzBuzz {
   public static List<String> fizzBuzz(int n){
       List<String> list = new ArrayList<>();
       for (int i = 1; i <=n ; i++) {
           if(i%15 ==0){
               list.add("FizzBuzz");
           }else if(i%3 ==0){
               list.add("Fizz");
           }else if(i%5 ==0){
               list.add("Buzz");
           }else{
               list.add(String.valueOf(i));
           }
       }
       return list;
   }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
    
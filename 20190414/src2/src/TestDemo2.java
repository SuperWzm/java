/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-14
 * Time: 10:02
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        System.out.println("1.计算开始前");
        try {
            System.out.println("2.进行数学计算：" + 10 / 0);
        }catch(ArithmeticException e){
            System.out.println("异常已经被处理");
        }
        System.out.println("3.计算结束后");
    }
}    
    
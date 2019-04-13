import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-09
 * Time: 13:52
 **/
class HelloA{
    public HelloA(){
        System.out.println("HelloA");//5
    }
    {
        System.out.println("i am A class");//3

    }
    static{
        System.out.println("static A");//1
    }
}
/*
class HelloB extends HelloA{
    public HelloB(){


        System.out.println("TestClass");//6
    }
    {
        System.out.println("i am TestClass");//4
    }
    static{
        System.out.println("static TestClass");//2
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        new HelloB();
    }


}    
    */

 class Test extends HelloA{
    public Test(){
        System.out.println("TestClass");
    }
    {
        System.out.println("i am TestClass");
    }
    static{
        System.out.println(" TestClass");
    }

    public static void main(String[] args) {
        new Test();
    }
}

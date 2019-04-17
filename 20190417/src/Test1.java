import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-17
 * Time: 12:54
 **/
class A{

}
class B extends A{

}
public class Test1 {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        A ba = new B();
        System.out.println("1================");
        System.out.println(b instanceof B);
        System.out.println(b instanceof Object);
        System.out.println(null instanceof Object);
        System.out.println("2================");
        System.out.println(b.getClass().isInstance(b));
        System.out.println(b.getClass().isInstance(a));
        System.out.println("3=================");
        System.out.println(a.getClass().isInstance(a));
        System.out.println(a.getClass().isInstance(ba));
        System.out.println(b.getClass().isInstance(ba));
        System.out.println(a.getClass().isInstance(null));
        System.out.println("4===================");
        System.out.println(A.class.isInstance(a));
        System.out.println(A.class.isInstance(b));
        System.out.println(A.class.isInstance(ba));
        System.out.println(B.class.isInstance(a));
        System.out.println(B.class.isInstance(b));
        System.out.println(B.class.isInstance(ba));
        System.out.println("5===================");
        System.out.println(Object.class.isInstance(a));
        System.out.println(Object.class.isInstance(b));
        System.out.println(Object.class.isInstance(ba));
        System.out.println(Object.class.isInstance(null));


    }
}    
    
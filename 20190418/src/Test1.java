/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-18
 * Time: 22:38
 **/
 abstract class A{
    public A(){
        this.print();
    }
   public abstract void print();
}
class B extends A{
    private int num = 100;
    public B(int num){
        super();
        this.num = num;
    }
    public void print(){
        System.out.println(this.num);
    }
}
public class Test1 {
    public static void main(String[] args) {
        new B(30).print();
    }
}    
    
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-09
 * Time: 16:43
 **/
abstract class A{
    public A(){
        this.print();
    }
    public abstract void print();
}

class B extends A{
    private int num=100;
    public B(int num){
        /*super();*/
        this.num=num;
    }
    public void print(){
        System.out.println(this.num);
    }

}

public class TestDemo5 {
    public static void main(String[] args) {
        new B(1);

    }


}    
    
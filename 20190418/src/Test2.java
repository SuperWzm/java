/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-18
 * Time: 22:43
 **/
class Person{
    public void fun(){
        this.print();
    }
    private void print(){
        System.out.println("1.");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("2.");
    }
}
public class Test2 {
    public static void main(String[] args) {
        new Student().fun();
    }
}    
    
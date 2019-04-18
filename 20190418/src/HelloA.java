/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-18
 * Time: 22:22
 **/
 public class HelloA {
    public HelloA(){
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    static {
        System.out.println("3");
    }
}
  class HelloB extends HelloA{
    public HelloB(){
        System.out.println("4.");
    }
    {
        System.out.println("5.");
    }
    static{
        System.out.println("6.");
    }

    public static void main(String[] args) {
        System.out.println("7.");
        new HelloB();
        new HelloA();
        System.out.println("8.");
    }
}
    
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-17
 * Time: 13:04
 **/
class Singleton{
    private static Singleton singleton;
    private Singleton(){
        System.out.println("Singleton.init()");
    }
    public static Singleton getInstence(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    public void print(){
        System.out.print("singleton.fun()");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Singleton singleton = null;
        singleton = Singleton.getInstence();
        singleton.print();
    }
}    
    
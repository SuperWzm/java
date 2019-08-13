/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-13
 * Time: 12:58
 **/
public final class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

    public void print(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        Singleton singleton = null;
        singleton = Singleton.getInstance();
        singleton.print();
    }
}

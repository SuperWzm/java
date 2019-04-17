/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-17
 * Time: 13:16
 **/
class MySingleton{
    private MySingleton (){
    }
    private static class Single {
        public static MySingleton mySingleton = new MySingleton();
    }
    public static MySingleton getInstence(){
        return Single.mySingleton;
    }
    public void print(){
        System.out.println("Hello Bit");
    }
}
public class Test3 {
    public static void main(String[] args) {
        MySingleton mySingleton =null;
        mySingleton = MySingleton.getInstence();
        mySingleton.print();

    }
}    
    
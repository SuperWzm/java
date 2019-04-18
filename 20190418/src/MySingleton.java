/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-18
 * Time: 22:48
 **/
public class MySingleton {
    private static MySingleton mySingleton = new MySingleton();
    private MySingleton(){

    }
    public static MySingleton getInstance(){
        return mySingleton;
    }
}    
    
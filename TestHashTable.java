import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-06-03
 * Time: 18:12
 **/
public class TestHashTable {
    public static void main(String[] args) {
        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("1","Java");
        hashtable.put("2",null);
        System.out.println(hashtable);
    }
}    

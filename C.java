/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-26
 * Time: 14:58
 **/
public class C{
    private synchronized void a(){

    }
    private void b(){

    }

    private synchronized static void c(){

    }

    private void d(){
        synchronized (C.class){

        }
    }
}
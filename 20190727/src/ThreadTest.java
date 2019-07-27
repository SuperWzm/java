import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-07-27
 * Time: 11:45
 **/

class Task implements Runnable{

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("1")){
            testA();
        }else{
            testB();
        }
    }
    public synchronized void testA(){
        System.out.println("线程1在运行。。。");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void testB(){
        System.out.println("线程2在运行。。。");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread1 = new Thread(task,"1");
        Thread thread2 = new Thread(task,"2");
        thread1.start();
        thread2.start();
    }
}    
    
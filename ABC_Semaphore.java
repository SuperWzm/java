import java.util.concurrent.Semaphore;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-25
 * Time: 21:36
 **/
public class ABC_Semaphore {

    private static Semaphore A = new Semaphore(1,true);
    private static Semaphore B = new Semaphore(0);
    private static Semaphore C = new Semaphore(0);

    static class ThreadA extends Thread{
        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    A.acquire();
                    System.out.println("A");
                    B.release();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static class ThreadB extends Thread{
        @Override
        public void run() {
            try{
                for (int i = 0; i < 10; i++) {
                    B.acquire();
                    System.out.println("B");
                    C.release();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static class ThreadC extends Thread{
        @Override
        public void run() {
            try{
                for (int i = 0; i < 10; i++) {
                    C.acquire();
                    System.out.println("C");
                    System.out.println("---------------");
                    A.release();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadB().start();
        new ThreadC().start();
    }
}    
    
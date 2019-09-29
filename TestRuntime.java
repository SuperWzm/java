/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-29
 * Time: 22:13
 **/
public class TestRuntime {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println("1 MAX_MEMORY = " + run.maxMemory());
        System.out.println("1 TOTAL_MEMORY = " + run.totalMemory());
        System.out.println("1 FREE_MEMORY = " + run.freeMemory());
        System.out.println("*****************************************");
        String str = "";
        for (int i = 0; i < 90000 ; i++) {
            str+="";
            new java.util.Date();
        }
        str = null;
        System.out.println("2 MAX_MEMORY = " + run.maxMemory());
        System.out.println("2 TOTAL_MEMORY = " + run.totalMemory());
        System.out.println("2 FREE_MEMORY = " + run.freeMemory());
        System.out.println("***************************************");
        run.gc();
        System.out.println("3 MAX_MEMORY = " + run.maxMemory());
        System.out.println("3 TOTAL_MEMORY = " + run.totalMemory());
        System.out.println("3 FREE_MEMORY = " + run.freeMemory());
}
}    
    
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-15
 * Time: 21:50
 **/
/*public class Test3 {
    public static void main(String[] args) {
        int line = 10;
        for (int x = 0;x<line;x++){
            for(int y = 0;y<line- x;y++){
                System.out.print(" ");
            }
            for(int z= 0;z<x; z++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/

/*public class Test3{
    public static void main(String[] args) {
        for(int i =1;i<5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

public class Test3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
                System.out.println("*");
            }
        }
    }
}
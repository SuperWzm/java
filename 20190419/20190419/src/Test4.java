/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-19
 * Time: 21:04
 **/
public class Test4 {
    public static void main(String[] args) {
       int a = 1;
       int b = 1;
       int c = 0;
        System.out.print(a+"\t"+b+"\t");
        for(int i =3;i<=12;i++){
            c = a+b;
            a = b;
            b = c;
            System.out.print(c+"\t");
        }
    }
}    
    
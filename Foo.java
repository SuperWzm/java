/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-26
 * Time: 18:02
 **/
public class Foo {

    static boolean foo(char c){
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for(foo('A');foo('B') && (i<2);foo('C')){
            i++;
            foo('D');
        }
    }
}    
    
package DuoTai;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-10-04
 * Time: 16:01
 **/
public class Test {
    public static void main(String[] args) {

        //向上转型
        Annimal an = new Dog();
        Girl g = new Girl();

        //向下转型
        Dog d = (Dog) an;
        g.play(an);
        d.run();
    }
}    
    
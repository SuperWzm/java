/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-16
 * Time: 11:54
 **/
public class Test5 {
    public static void main(String[] args) {
        MySequenceImpl mySequence = new MySequenceImpl();
        mySequence.add(0,18);
        mySequence.add(1,"bit");
        mySequence.add(2,"hello");
        mySequence.add(1,99);
        mySequence.display();// 18 99 bit hello
        System.out.println(mySequence.remove("bit"));
        mySequence.display();
        System.out.println(mySequence.contains("gao"));
        mySequence.clear();
        mySequence.display();
    }
}    
    
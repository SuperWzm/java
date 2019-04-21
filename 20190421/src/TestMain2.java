import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-21
 * Time: 17:05
 **/
public class TestMain2 {
    public static void main(String[] args) {
        DoubleLinkedListImpl doubleLinkedList = new DoubleLinkedListImpl();
        doubleLinkedList.addFirst(10);
        doubleLinkedList.addFirst(20);
        doubleLinkedList.addFirst(30);
        doubleLinkedList.addFirst(40);
        doubleLinkedList.display();

        doubleLinkedList.addLast(10);
        doubleLinkedList.addLast(20);
        doubleLinkedList.addLast(30);
        doubleLinkedList.addLast(40);
        doubleLinkedList.display();

        doubleLinkedList.addindex(0,99);
        doubleLinkedList.display();
        doubleLinkedList.addindex(3,88);
        doubleLinkedList.display();
        doubleLinkedList.addindex(10,100);
        doubleLinkedList.display();

        System.out.println(doubleLinkedList.contains(10));
        System.out.println(doubleLinkedList.contains(111));

        System.out.println("================================");

        System.out.println(doubleLinkedList.remove(40));
        doubleLinkedList.display();

        System.out.println(doubleLinkedList.remove(100));
        doubleLinkedList.display();
        System.out.println(doubleLinkedList.remove(99));
        doubleLinkedList.display();


        doubleLinkedList.removeAllKey(10);
        doubleLinkedList.display();
        doubleLinkedList.removeAllKey(20);
        doubleLinkedList.display();



    }

}    
    
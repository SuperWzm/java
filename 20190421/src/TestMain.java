/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-21
 * Time: 15:29
 **/
public class TestMain {
    public static void main(String[] args) {
        HeadSingleListImpl headSingleList = new HeadSingleListImpl();
        headSingleList.addFirst(10);
        headSingleList.addFirst(20);
        headSingleList.addFirst(30);
        headSingleList.addFirst(40);
        headSingleList.display();

        headSingleList.addLast(10);
        headSingleList.addLast(20);
        headSingleList.addLast(30);
        headSingleList.addLast(40);
        headSingleList.display();// 40 30 20 10 10 20 30 40
      headSingleList.addindex(0,77);
        headSingleList.display();//77 40 30 20 10 10 20 30 40
        headSingleList.addindex(0,66);
        headSingleList.display();//66 77 40 30 20 10 10 20 30 40
        headSingleList.addindex(8,77);
        headSingleList.display();//66 77 40 30 20 10 10 20 77 30 40
        headSingleList.addindex(3,87);
        headSingleList.display();//66 77 40 87 30 20 10 10 20 77 30 40
        System.out.println(headSingleList.contains(20));
        System.out.println(headSingleList.contains(999));
        System.out.println(headSingleList.remove(66));
        headSingleList.display();
        System.out.println(headSingleList.remove(40));
        headSingleList.display();

        headSingleList.removeAllKey(20);
        headSingleList.display();

/*
        headSingleList.clear();
        headSingleList.display();
*/

    }
}    
    
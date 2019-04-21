/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-19
 * Time: 11:46
 **/
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MySingleList mySingleList = new MySingleList();
        /*mySingleList.addFirst(10);
        mySingleList.addFirst(20);
        mySingleList.addFirst(30);
        mySingleList.addFirst(40);
        mySingleList.addFirst(50);
        mySingleList.display();*/

       /* mySingleList.addLast(10);
        mySingleList.addFirst(88);
        mySingleList.addLast(20);
        mySingleList.addLast(30);
        mySingleList.addFirst(99);
        mySingleList.addLast(40);
        mySingleList.display();*/

        mySingleList.addIndex(0,10);
        mySingleList.addIndex(1,99);
        mySingleList.addIndex(2,20);
        mySingleList.addIndex(3,30);
        mySingleList.addIndex(4,88);
        mySingleList.addLast(40);
        mySingleList.addIndex(6,88);
        mySingleList.display();//10 99 20 30 88 40 98
        MySingleList.Node res = mySingleList.reverseList();
        mySingleList.show(res);
        /*mySingleList.show(mySingleList.reverseList());*/
 /*       System.out.println(mySingleList.contains(20));
        System.out.println(mySingleList.contains(21));*/
 /*       mySingleList.remove(10);
        mySingleList.display();//99 20 30 88 40 98*/
 /*     mySingleList.removeAllKey(88);
        mySingleList.display();
*/
        /*mySingleList.clear();*/
       /* Thread.sleep(1000);
        System.out.println("Hello bit");*/


       /* mySingleList.addFirst(10);
        mySingleList.addFirst(20);
        mySingleList.addFirst(30);
        mySingleList.addFirst(40);
        System.out.println(mySingleList.getLength());*/

       /*mySingleList.addLast(10);
       mySingleList.addLast(20);
       mySingleList.addLast(30);
       System.out.println(mySingleList.contains(20));
*/

       /* mySingleList.addFirst(10);
        mySingleList.addFirst(20);
        mySingleList.addFirst(30);
        mySingleList.addFirst(40);
        mySingleList.addFirst(50);
        mySingleList.clear();
        mySingleList.display();*/





    }


}    
    
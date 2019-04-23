

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-19
 * Time: 11:46
 **/
public class Test2 {
    public static void createCut(MySingleList.Node headA,MySingleList.Node headB){
        headA.next.next = headB.next.next;
    }


    public static MySingleList.Node getIntersectionNode(MySingleList.Node headA, MySingleList.Node headB) {
        MySingleList.Node pLong = headA;
        MySingleList.Node pShort = headB;
        int lenA = 0;
        while(pLong != null) {
            lenA++;
            pLong = pLong.getNext();
        }
        int lenB = 0;
        while(pShort != null) {
            lenB++;
            pShort = pShort.getNext();
        }
        pLong = headA;
        pShort = headB;

        int myLen = lenA-lenB;

        if(myLen < 0) {
            pLong = headB;
            pShort = headA;
            myLen = lenB-lenA;
        }
        for (int i = 0; i < myLen; i++) {
            pLong = pLong.getNext();
        }

        //起点相同了

        while(pLong != null && pShort != null && pLong != pShort){
                pLong = pLong.getNext();
                pShort = pShort.getNext();
            }
            if(pLong == pShort && pLong != null && pShort != null){
            return pLong;
            }
            return null;
    }
//5丶将两个有序的链表合并为一个新的有序链表并返回。
public static MySingleList.Node mergeTwoLists(MySingleList.Node headA,MySingleList.Node headB) {
    MySingleList mySingleList = new MySingleList();
    MySingleList.Node newHead = mySingleList.new Node(-1);
    MySingleList.Node tempHead = newHead;
    while (headA != null && headB != null) {
        if (headA.getData() >= headB.getData()) {
            newHead.next = headB;
            newHead = headB;
            headB = headB.next;
        } else {
            newHead.next = headA;
            newHead = headA;
            headA = headA.next;
        }
    }
    if(headA != null){
        newHead.next = headA;
    }
    if(headB != null){
        newHead.next = headB;
    }
    return tempHead;
}



    public static void main(String[] args) throws InterruptedException {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(10);
        mySingleList.addLast(20);
        mySingleList.addLast(30);
        mySingleList.addLast(40);
        mySingleList.addLast(50);
        mySingleList.addLast(60);
        mySingleList.display();

        MySingleList mySingleList1 = new MySingleList();
       mySingleList.addLast(7);
       mySingleList.addLast(8);
       mySingleList.addLast(9);
       mySingleList.addLast(10);
       mySingleList.addLast(11);
       mySingleList.addLast(12);
       mySingleList.display();
        System.out.println("===================");
    /*    MySingleList.Node cur = mergeTwoLists(mySingleList.getHead(),mySingleList1.getHead());
        mySingleList.show(cur);*/

        createCut(mySingleList.getHead(),mySingleList1.getHead());
        mySingleList.display();
        mySingleList1.display();
        MySingleList.Node cur1 = getIntersectionNode(mySingleList.getHead(),mySingleList1.getHead());
        System.out.println(cur1.getData());


/*      mySingleList.addFirst(10);
        mySingleList.addFirst(20);
        mySingleList.addFirst(30);
        mySingleList.addFirst(40);
        mySingleList.addFirst(50);
        mySingleList.display();*/

/*
        mySingleList.addLast(10);
        mySingleList.addFirst(88);
        mySingleList.addLast(20);
        mySingleList.addLast(30);
        mySingleList.addFirst(99);
        mySingleList.addLast(40);
        mySingleList.display();
*/

/*        mySingleList.addIndex(0,10);
        mySingleList.addIndex(1,99);
        mySingleList.addIndex(2,20);
        mySingleList.addIndex(3,30);
        mySingleList.addIndex(4,88);
        mySingleList.addLast(40);
        mySingleList.addIndex(6,88);
        mySingleList.display();//10 99 20 30 88 40 98

/*        MySingleList.Node res = mySingleList.reverseList();
        mySingleList.show(res);*/
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

/*
       mySingleList.addLast(10);
       mySingleList.addLast(20);
       mySingleList.addLast(40);
       mySingleList.addLast(40);
       mySingleList.addLast(20);
       mySingleList.addLast(10);
       mySingleList.display();

       System.out.println(mySingleList.chkPalindrome());
*/



/*      MySingleList.Node cur =  mySingleList.detectCycle();
      mySingleList.show(mySingleList.deleteDuplication());*/

/*       mySingleList.creatCycle();
       MySingleList.Node cur1 = mySingleList.detectCycle();
        System.out.println(cur1.getData());*/
/*
       MySingleList.Node cur = mySingleList.findKthToTail(4);
       System.out.println(cur.getData());*/

/*       mySingleList.creatCycle();
       System.out.println(mySingleList.hasCycle());*/

/*       mySingleList.show(mySingleList.reverseList());*/

/*      MySingleList.Node cur = mySingleList.middleNode();
      mySingleList.show2(cur);*/

/*        MySingleList.Node cur = mySingleList.middleNode();
        System.out.println(cur.getData());*/







    }


}    
    
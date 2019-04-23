/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-19
 * Time: 11:41
 **/
public class MySingleList implements ILinked {

    class Node {
        public int getData() {
            return data;
        }

        private int data;

        public Node getNext() {
            return next;
        }

        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node getHead() {
        return head;
    }

    private Node head;

    public MySingleList() {
        this.head = null;
    }

    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        //第一次插入的时候，没有任何的数据节点
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            //cur所指向的位置就是尾节点
            cur.next = node;
        }

    }

    //检查index合法性
    private void checkIndex(int index) {
        if (index < 0 || index > getLength()) {
            throw new UnsupportedOperationException("Index不合法");
        }
    }

    //找到index-1的位置，函数返回该位置的节点引用
    private Node searchIndex(int index) {
        int count = 0;
        Node cur = this.head;
        while (count < index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    @Override
    public boolean addIndex(int index, int data) {
        checkIndex((index));
        //头插法
        if (index == 0) {
            addFirst(data);
            return true;
        } else {
            Node node = new Node(data);
            Node cur = searchIndex(index);
            node.next = cur.next;
            cur.next = node;

        }
        return true;
    }

    @Override
    public boolean contains(int key) {
        Node cur = this.head;
        /*if(this.head==null){
            return false;
        }*/
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //查找关键字key的前驱
//如果找不到，返回null
    private Node searchPre(int key) {
        Node pre = this.head;
        //头结点是要删除的数据节点
        if (pre.data == key) {
            return this.head;
        }
        while (pre.next != null) {
            if (pre.next.data == key) {
                return pre;
            }
            pre = pre.next;
        }
        return null;
    }

    @Override
    public int remove(int key) {
        int oldData = 0;
        Node pre = searchPre(key);
        if (pre == null) {
            throw new UnsupportedOperationException("不存在key节点");
        }
        if (pre == head && pre.data == key) {
            oldData = this.head.data;
            this.head = this.head.next;
            return oldData;
        }
        Node del = pre.next;
        oldData = del.data;//先保存
        pre.next = del.next;//删除节点
        return oldData;
    }

    @Override
    public void removeAllKey(int key) {
        if (this.head == null) {
            return;
        }
        Node pre = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if (cur.data == key) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

    @Override
    public int getLength() {
        Node cur = this.head;
        int length = 0;
        while (cur != null) {
            cur = cur.next;
            length++;
        }
        return length;
    }

    @Override
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public void clear() {
        Node cur = this.head;
        while (this.head != null) {
            this.head.next = null;
            this.head = cur;
            cur = cur.next;
        }

    }
    //单链表第2题，反转一个单链表
/*    public Node reverseList() {
        Node cur = this.head;
        Node pre = null;
        Node reverseHead = null;
        while(cur != null){
            Node curNext = cur.next;
          if(curNext == null){
              reverseHead = cur;
          }
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
         return reverseHead;
    }*/

    public Node reverseList() {
        Node cur = this.head;
        Node pre = null;
        Node reverseHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                reverseHead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return reverseHead;
    }


    //单链表第7题 删除重复的节点
    public Node deleteDuplication() {
        Node newHead = new Node(-1);
        Node cur = this.head;
        Node tempHead = newHead;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
                newHead.next = cur;
            } else {
                newHead.next = cur;
                newHead = cur;
                cur = cur.next;
            }
        }
        return tempHead.next;
    }

    public void show2(Node cur) {
        System.out.println(cur.data);
    }

    public void show(Node resHead) {
        Node cur = resHead;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

   /* public Node middleNode() {
        Node node = this.head;
        if (node == null && node.next == null) {
            return head;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast.next != null && fast!= null) {
            fast = fast.next;
            slow = slow.next;
            if(fast != null){
                fast = fast.next;
            }
            else{
                return slow;
            }
        }

        return slow;
    }*/

    /*public Node middleNode() {
        int length = getLength();
        Node cur = this.head;
        for (int i = 0; i < length / 2; i++) {
            cur = cur.next;
        }
        return cur;

    }*/


  /*  public Node findKthToTail(int k) {
        Node fast = this.head;
        Node slow = this.head;
        if (fast == null || k <= 0  ) {
            System.out.println("沒有这个节点");
            return null;
        }
        //fast 走 k-1
        while(k-1>0){
            if(fast.next != null){
                fast = fast.next;
                k--;
            }else{
                System.out.println("没有这个节点");
                return null;
            }
        }
        //同时走
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }*/

    public Node findKthToTail(int k) {
        Node fast = this.head;
        Node slow = this.head;
        while(fast == null || k<=0){
            System.out.println("没有这个节点");
            return null;
        }
        while(k-1>0){
            if(fast.next != null){
                fast = fast.next;
                k--;
            }else{
                System.out.println("没有这个节点");
            }
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


/*
    public Node partition(int x){
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;
        //pHead用来遍历原来的单链表
        Node pHead = this.head;
        while(pHead != null){
            if(pHead.data<x){
            if(beforeStart == null){
               beforeStart = pHead;
               beforeEnd = beforeStart;
            }else{
                beforeEnd.next = pHead;
                beforeEnd = pHead;
            }
            }else{
                if(afterStart == null){
                    afterStart = pHead;
                    afterEnd = afterStart;
                }else{
                    afterEnd.next = pHead;
                    afterEnd = pHead;
                }
            }
            pHead = pHead.next;
        }
    }
}*/

    //构造一个环
    public void creatCycle(){
        Node cur = this.head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = this.head.next.next.next;
    }

/*    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
    }
    return false;
}*/

public boolean hasCycle(){
    Node fast = this.head;
    Node slow = this.head;
   while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow){
            return true;
        }
    }
    return false;
    }


   /* public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
               }
            }
            if(fast == null || fast.next == null){
            return null;
        }
        slow = this.head;
        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }*/

    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
            if(fast ==null || fast.next == null) {
                return null;
            }
            slow = this.head;
            while(fast != slow){
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
        //8丶判断链表是否为回文结构
    public boolean chkPalindrome() {
        if(this.head == null){
            return false;
        }else if(this.head.next == null){
            return true;
        }
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node pre = slow.next;
        Node preNext = pre.next;
        while(pre != null){
            pre.next = slow;
            slow = pre;
            pre = preNext;
            if(pre != null){
                preNext = pre.next;
            }
        }
        while(head != slow){
            if(head.data != slow.data){
                return false;
            }
            if(head.next == slow){
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

}
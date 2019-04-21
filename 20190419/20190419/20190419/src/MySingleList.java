/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-19
 * Time: 11:41
 **/
public class MySingleList implements ILinked {

    class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public MySingleList(){
        this.head = null;
    }
    @Override
    public void addFirst(int data) {
         Node node = new Node(data);
         //第一次插入的时候，没有任何的数据节点
        if(this.head == null){
            this.head = node;
        }else{
            node.next = this.head;
            this.head = node;
        }
    }

    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null){
          this.head = node;
        }else{
            Node cur = this.head;
            while(cur.next != null){
                cur = cur.next;
            }
            //cur所指向的位置就是尾节点
            cur.next = node;
        }

    }
//检查index合法性
private void checkIndex(int index){
        if(index<0 || index>getLength()){
            throw new UnsupportedOperationException("Index不合法");
        }
}
//找到index-1的位置，函数返回该位置的节点引用
private Node searchIndex(int index){
        int count = 0;
        Node cur = this.head;
        while(count<index-1){
            cur = cur.next;
            count++;
        }
        return cur;
}
    @Override
    public boolean addIndex(int index, int data) {
        checkIndex((index));
        //头插法
        if(index == 0){
            addFirst(data);
            return true;
        }else{
            Node node = new Node(data);
            Node cur = searchIndex(index);
            node.next = cur.next;
            cur.next = node;

        }
        return true;
    }

    @Override
    public boolean contains(int key) {
        Node cur =this.head;
        /*if(this.head==null){
            return false;
        }*/
         while(cur != null){
            if(cur.data ==key){
                return true;
            }
            cur = cur.next;
         }
        return false;
    }
//查找关键字key的前驱
//如果找不到，返回null
private Node searchPre(int key){
        Node pre = this.head;
        //头结点是要删除的数据节点
    if(pre.data == key){
        return this.head;
    }
    while (pre.next != null){
        if(pre.next.data == key){
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
        if(pre == null){
           throw new UnsupportedOperationException("不存在key节点");
        }
        if(pre == head && pre.data ==key){
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
        if(this.head == null){
            return ;
        }
        Node pre = this.head;
        Node cur = this.head.next;
        while(cur != null){
            if(cur.data == key ){
                pre.next = cur.next;
                cur = cur.next;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key){
            this.head = this.head.next;
        }
    }

    @Override
    public int getLength() {
        Node cur = this.head;
        int length = 0;
        while(cur != null){
            cur = cur.next;
           length++;
        }
        return length;
    }

    @Override
    public void display() {
        Node cur =this.head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public void clear() {
        Node cur = this.head;
       while(this.head != null){
          this.head.next = null;
          this.head = cur;
          cur = cur.next;
        }

    }

    public Node reverseList() {
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
    }
    public void show(Node resHead){
        Node cur = resHead;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
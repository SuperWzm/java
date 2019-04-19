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
    private Node tail;
    public MySingleList(){
        this.head = null;
        this.tail = null;
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
          this.tail = node;
          this.head = this.tail;
        }else{
            this.tail.next = node;
            this.tail = this.tail.next;
        }

    }

    @Override
    public boolean addIndex(int index, int data) {
        return false;
    }

    @Override
    public boolean contains(int key) {
        Node cur = head;
        if(this.head==null){
            return false;
        }
         while(cur != null){
            if(cur.data ==key){
                return true;
            }
            cur = cur.next;
         }
        return false;
    }


    @Override
    public int remove(int key) {
        Node cur = head;
        while(cur.data != key){

        }
        return 0;
    }

    @Override
    public void removeAllKey(int key) {

    }

    @Override
    public int getLength() {
        Node curNode = this.head;
        int length = 0;
        while(curNode != null){
            curNode = curNode.next;
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

        Node cur2 = this.head;
        while(cur2 !=null){
            System.out.print(cur2.data+" ");
            cur2 = cur2.next;
        }
        System.out.println();

    }

    @Override
    public void clear() {

    }
}
    
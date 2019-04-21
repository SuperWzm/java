/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-21
 * Time: 17:02
 **/
public class DoubleLinkedListImpl implements IDoubleLinked {
    class Node{
        private int data;
        private Node next;//后继
        private  Node prev;//前驱
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head;
    private Node last;
    public DoubleLinkedListImpl(){
        this.head = null;
        this.last = null;
    }
    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            this.last = node;
        }else{
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }

    }

    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            this.last = node;
        }else{
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }

    }
private Node seachIndex(int index){
        checkIndex(index);
        Node cur = this.head;
        int count = 0;
        while(count<index){
            cur = cur.next;
            count++;
        }
        return cur;
}

private void checkIndex(int index){
        if(index<0 || index>getLength()){
            throw new IndexOutOfBoundsException("下标不合法");
        }
}
    @Override
    public boolean addindex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return true;
        } else if (index == getLength()) {
            addLast(data);
            return true;
        }
            Node node = new Node(data);
            Node cur = seachIndex(index);

            node.next = cur;
            node.prev =cur.prev;
            node.prev.next = node;
            node.next.prev = node;

            return false;
    }

    @Override
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public int remove(int key) {
        Node cur = this.head;
        while(cur != null){
            if(cur.data ==key){
                int oldData = cur.data;
                //要删除的是头结点
                if(cur == this.head){
                    this.head = this.head.next;
                    this.head.prev = null;
                }else{
                    cur.prev.next = cur.next;
                    //cur.next != null表示删除的不是尾节点
                    if(cur.next != null){
                        cur.next.prev = cur.prev;
                    }else{
                        //尾节点删除，last需要移动
                        this.last = cur.prev;
                    }

                }
            }
            cur = cur.next;
        }
        return 0;
    }

    @Override
    public void removeAllKey(int key) {
        Node cur = this.head;
        while(cur != null){
            if(cur.data ==key){
                //要删除的节点是头结点
                if(cur == this.head){
                    this.head = this.head.next;
                    this.head.prev = null;
                }else{
                    cur.prev.next = cur.next;
                    //cur.next != null表示删除的不是尾节点
                    if(cur.next != null){
                        cur.next.prev = cur.prev;
                    }else{
                        //尾节点删除，last需要移动
                        this.last = cur.prev;
                    }

                }
            }
            cur = cur.next;
        }
    }

    @Override
    public int getLength() {
        int count = 0;
        Node cur = this.head;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    @Override
    public void display() {
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public void clear() {
        while(this.head.next != null ){
            Node cur = this.head.next;
            //this.head.prev = null;
            this.head.next = cur.next;
            cur.prev = null;
        }
         this.head = null;
         this.last = null;
    }
}
    
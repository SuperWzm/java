

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-11
 * Time: 15:46
 **/
public class CustomizationSingleLinkedList<T> {

    private Node head;
    private int size;

    class Node<T>{
        private T data;
        private Node next;

        public Node(T data,Node next){
            this.data = data;
            this.next = next;
        }
    }

    //创建空链表
    public CustomizationSingleLinkedList() {
        //TODO
        this.head = null;
        this.size = 0;
    }


    //以指定数据元素来创建链表，该链表只有一个元素
    public CustomizationSingleLinkedList(T element) {
        //TODO
        Node node = new Node(element,null);
        this.size++;
    }

    /**
     * 返回链表长度
     *
     * @return
     */
    public int length() {
        //TODO
        return this.size;
    }

    /**
     * 获取链表中指定索引的元素
     *
     * @param index
     * @return
     */
    public T get(int index) {
        //TODO
        Node cur = getNodeByIndex(index);
        return (T) cur.data;
    }

    private Node getNodeByIndex(int index) {
        //TODO
        if(index<0 || index >= this.length()){
            throw new IllegalArgumentException("index="+index+"超过了范围");
        }
        Node cur = this.head;
        for (int i = 0; i < index; i++) {
            cur=cur.next;
        }
        return cur;
    }

    /**
     * 查找链表中指定元素的索引
     *
     * @param element
     * @return
     */
    public int locate(T element) {
        //TODO
        Node cur = this.head;
        int curIndex = 0;
        while(cur != null){
            if(cur.data == element){
                return  curIndex;
            }
        }
        return -1;
    }

    /**
     * 向线性表指定位置插入一个元素
     *
     * @param element
     * @param index
     */
    public void insert(T element, int index) {
        //TODO
    }

    /**
     * 采用尾插入法为链表添加新节点
     *
     * @param element
     */
    public void add(T element) {
        //TODO
    }

    /**
     * 采用头插入法为链表添加新节点
     *
     * @param element
     */
    public void addAtHeader(T element) {
        //TODO
    }

    /**
     * 删除链表中指定索引处的元素
     *
     * @param index
     * @return
     */
    public T delete(int index) {
        //TODO
    }

    /**
     * 删除链表中最后一个元素
     *
     * @return
     */
    public T remove() {
        return this.delete(this.size - 1);
    }

    /**
     * 判断链表是否为空
     *
     * @return
     */
    public boolean empty() {
        //TODO
    }

    /**
     * 清空链表
     */
    public void clear() {
        //TODO
    }

    @Override
    public String toString() {
        //TODO
    }

    public static void main(String[] args) {
        CustomizationSingleLinkedList<String>  list = new CustomizationSingleLinkedList<>();
        //TODO
    }
}


    
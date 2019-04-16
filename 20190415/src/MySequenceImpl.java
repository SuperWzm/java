import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-16
 * Time: 11:57
 **/
public class MySequenceImpl implements ISequence {
    private Object[] elem;
    private int usedSize;
    //默认顺序表的容量
    private static  final int DEFAULT_SIZE = 10;
    public MySequenceImpl(){
        this.elem = new Object[DEFAULT_SIZE];
        this.usedSize = 0;

    }
    public boolean isFull(){
        if(this.usedSize==this.elem.length){
            return true;
    }
        return false;
    }
    @Override
    public boolean add(int pos, Object data) {
        //1丶pos的合法性  2丶是否是满的顺序表
        if(pos<0||pos>this.usedSize){
        return false;
    }
    if(isFull()){
            //让数组扩大原来的2倍
        this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
    }
    //挪数据（往前挪）
    for(int i =this.usedSize-1;i>=pos;i--){
            this.elem[i+1] = this.elem[i];
    }
    this.elem[pos] = data;
        this.usedSize++;
        return true;
    }
    public boolean isEmpty(){
        if(this.usedSize==0){
            return true;
        }
        return false;
       /*return this.usedSize == 0; */
    }

    @Override
    public int search(Object key) {
        if(key == null){
            return -1;
        }
        if(isEmpty()){
            throw new UnsupportedOperationException("顺序表为空");
        }
        for(int i = 0;i<this.usedSize;i++){
            if(this.elem[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object key) {
        if(key==null){
            return false;
        }
        if(isEmpty()){
            throw new UnsupportedOperationException("顺序表为空");
        }
        for(int i = 0;i<this.usedSize;i++){
            if(this.elem[i].equals(key)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Object getPos(int pos) {
        if(pos<0||pos>=this.usedSize){
            return null;
        }
        return this.elem[pos];
    }
     //在删除之前，先保存需要删除的值作为返回值
    @Override
    public Object remove(Object key) {
        int index = search(key);
        if(index == -1){
            return null;
        }
        Object oldData = this.elem[index];
        int i =0;
     for( i = index;i<this.usedSize-1;i++){
         this.elem[i]=this.elem[i+1];
     }
     this.elem[i+1]=null;
     this.usedSize--;
     return oldData;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void display() {
        for(int i = 0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();

    }

    @Override
    public void clear() {
        for(int i =0;i<this.usedSize;i++){
           this.elem[i] = null;
        }
        this.usedSize=0;

    }
}
    
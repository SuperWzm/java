/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-24
 * Time: 17:59
 **/
public class MyStack implements IMyStack {

    private int top;//永远指向可以存放数据元素的下标
    private int[] elem;//数组
    private int usedSize;//数据元素的个数

    public MyStack(int size){
        this.top = 0;
        this.elem = new int [size];
        this.usedSize = 0;
    }

    private boolean isFull(){
        return this.usedSize == this.elem.length;
    }
    @Override
    public void push(int item) {
        if(isFull()){
            throw new UnsupportedOperationException("栈为满");
        }
        this.elem[this.top++] = item;
        this.usedSize++;

    }

    @Override
    public int pop() {
        if(empty()){
            throw new UnsupportedOperationException("栈为空");
        }
        int data = this.elem[this.top-1];
        this.top--;
        this.usedSize--;
        return data;
    }

    @Override
    public int peek() {
        if(empty()){
            throw new UnsupportedOperationException("栈为空");
        }
        return this.elem[this.top-1];
    }

    @Override
    public boolean empty() {
        return this.top ==0;
    }

    @Override
    public int size() {
        return this.usedSize;
    }
}
    
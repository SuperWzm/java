/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-26
 * Time: 22:58
 **/
public class Test2 {

    private MyQueue myQueue1;
    private MyQueue myQueue2;
    private int usedSize;

    public Test2(){
        this.myQueue1 = new MyQueue();
        this.myQueue2 = new MyQueue();
        this.usedSize = 0;
    }
    //入栈
    public void push(int x){
        if(!myQueue1.empty()){
            myQueue1.add(x);
        }else if(!myQueue2.empty()) {
            myQueue2.add(x);
        }else{
            myQueue1.add(x);
        }
        this.usedSize++;
    }

    //出栈
    public int pop(){
        if(empty()){
            return -1;
        }
        int data = 0;
        if(!myQueue1.empty()){
            for(int i = 0;i<this.usedSize-1;i++){
                myQueue1.add(myQueue2.poll());
            }
            data = myQueue1.poll();
        }else{
            for(int i = 0;i<this.usedSize-1;i++){
                myQueue1.add(myQueue2.poll());
            }
            data = myQueue2.poll();
        }
        this.usedSize--;
        return data;
    }

    public int top(){
        if(empty()){
            return -1;
        }
        int data = 0;
        if(!myQueue1.empty()){
            for (int i = 0; i <this.usedSize ; i++) {
                data = myQueue1.poll();
                myQueue2.add(data);
            }
        }else{
            for (int i = 0; i <this.usedSize; i++) {
                data = myQueue2.poll();
                myQueue1.add(data);
            }
        }
        return data;
    }

    public boolean empty(){
        return this.usedSize == 0;
    }

    public int size(){
        return this.usedSize;
    }
}    
    
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-09
 * Time: 17:01
 **/
interface IMessage{
    public static final String MSG = "I am a biter";
    public abstract void print();
}

interface INews{
    public abstract String getNews();
}

class IMessage2 implements IMessage,INews{

    public void print(){

        System.out.println(IMessage.MSG);
    }
    public String getNews() {
        /*return IMessage.MSG;*/
        /*System.out.println("lala");*/
        return IMessage.MSG;
    }

}

public class TestDemo1 {
    public static void main(String[] args){

        IMessage m = new IMessage2();
        m.print();

        INews n= (INews) m;
        System.out.println(n.getNews());




    }




}    
    
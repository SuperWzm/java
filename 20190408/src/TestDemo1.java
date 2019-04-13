/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-08
 * Time: 22:21
 **/
abstract class BankTemplate{
    public final void takeNumber(){
        System.out.println("1.取号");
    }
    public abstract void transact();

    public final void evelauate(){
        System.out.println("3.业务评价");
    }
    final void process(){
        takeNumber();
        transact();
        if(isEvaluate()){
            evelauate();
        }

    }
    public boolean isEvaluate(){
        return true;
    }
}

class User1  extends  BankTemplate{

    @Override
    public void transact() {
        System.out.println("2.我要取1个亿");
    }
    public boolean isEvaluate(){
        return false;
    }

}

class User2 extends BankTemplate{


    @Override
    public void transact() {
        System.out.println("2.我要存1个亿");
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        BankTemplate bankTemplate=new User1();
        bankTemplate.process();
        BankTemplate bankTemplate2=new User2();
        bankTemplate2.process();
    }

}    
    
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-08
 * Time: 22:51
 **/
abstract class OnlineShoping {
    public final void browseGoods() {
        System.out.println("1.浏览商品");
    }

    public final void selectGoods() {
        System.out.println("2.选择商品");
    }

    public abstract void callServise();

    public final void computerPrice() {
        System.out.println("4.结算");
    }

    public abstract void orderPay();

    public abstract void sendService();

    public final void showOrder() {
        System.out.println("7.查看订单");
    }


    final void process() {
        browseGoods();
        selectGoods();
        if (isCallService()) {
            callServise();
        }

        computerPrice();
        orderPay();
        sendService();
        showOrder();


    }

    public boolean isCallService() {
        return true;
    }
}

class JD extends OnlineShoping {

    @Override
    public void callServise() {
        System.out.println("3.您好，京东客服为您服务");
    }

    public String getAnswer() {
        System.out.println("是否需要客服服务？要  不要");
        Scanner scanner=new Scanner(System.in);
        String str =scanner.nextLine();
        return str;
    }



    @Override
    public void orderPay() {
        System.out.println("5.微信支付");

    }

    @Override
    public void sendService() {
        System.out.println("6.京东配送");

    }
    public boolean isCallService(){
        String answer =getAnswer();
        if(answer.equals("要")){
            return true;
            }
        return false;
    }
}


public class TestDemo2 {
    public static void main(String[] args) {
      /*  OnlineShoping onlineShoping = new JD();
        onlineShoping.process();*/
         JD jd = new JD();
         jd.process();

    }
}    

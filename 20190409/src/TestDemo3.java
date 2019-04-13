/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-09
 * Time: 18:03
 **/
interface  USB{
    void read();
    void write();
}

class YouPan implements USB{

    @Override
    public void read() {
        System.out.println("U盘正在通过USB功能读取数据");
    }

    @Override
    public void write() {
        System.out.println("U盘正在通过USB功能写入数据");

    }
}

class JianPan implements USB{

    @Override
    public void read() {
        System.out.println("键盘正在通过USB功能读取数据");
    }

    @Override
    public void write() {
        System.out.println("键盘正在通过USB功能写入数据");

    }
}



public class TestDemo3{



    public static void main(String[] args) {
        YouPan youPan = new YouPan();
        youPan.read();
        youPan.write();

        JianPan jianPan = new JianPan();
        jianPan.read();
        jianPan.write();
    }


}

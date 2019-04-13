/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-09
 * Time: 17:23
 **/

interface in1
{
    final int a = 10;

    void display();
}

class testClass implements in1
{

    public void display()
    {
        System.out.println("Geek");
    }


    public static void main (String[] args)
    {
        testClass t = new testClass();
        t.display();
        System.out.println(a);
    }
}

    
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-09
 * Time: 14:06
 **/
abstract class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age = age;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age ){
        this.age=age;
    }
    public abstract void getPersonInfo();{
        System.out.println("姓名："+this.name+"年龄："+this.age);
    }
}
class Student extends Person{
    public Student(String name,int age){
        super(name,age);
    }

    @Override
    public void getPersonInfo() {
        System.out.println("姓名："+this.getName()+"年龄:"+this.getAge());
    }
}

class Teacher extends Person{
    public Teacher(String name,int age){
        super(name,age);
    }

    @Override
    public void getPersonInfo() {
        System.out.println("姓名："+this.getName()+"年龄："+this.getAge());
    }
}

public class TestDemo4 {
    public static void main(String[] args) {
        /* Person p= new Person("bit",10);*///抽象类借口不能被实例化
        Student student = new Student("皮皮虾", 100);
        student.getPersonInfo();

        Person p = new Student("bit", 10);
        p.getPersonInfo();

        Teacher teacher = new Teacher("内涵", 60);
        teacher.getPersonInfo();

    }



}    
    
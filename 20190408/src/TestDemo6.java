/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-09
 * Time: 16:54
 **/

class Coffee {
    public void boilWater() {
        System.out.println("1、将水煮沸");
    }
    public void brewUseWaterCoffee() {
        System.out.println("2、用水泡咖啡");
    }
    public void pourInCupCoffee(){
        System.out.println("3、将咖啡倒入杯子");
    }
    public void addSugarMilk() {
        System.out.println("4、加牛奶和糖");
    }

    public void makeCoffee() {
        boilWater();
        brewUseWaterCoffee();
        pourInCupCoffee();
        addSugarMilk();
        System.out.println();
    }
}
/*class Tea {
    public void boilWater() {
        System.out.println("1、将水煮沸");
    }
    public void brewUseWaterTea() {
        System.out.println("2、用水泡茶");
    }
    public void pourInCupTea(){
        System.out.println("3、将茶倒入杯子");
    }

    public void addLemon() {
        System.out.println("4、加柠檬");
    }

    public void makeTea() {
        boilWater();
        brewUseWaterTea();
        pourInCupTea();
        addLemon();
        System.out.println();
    }
}*/



public class TestDemo6 {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.makeCoffee();
/*
        Tea tea = new Tea();
        tea.makeTea();*/
    }
}

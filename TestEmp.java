import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-20
 * Time: 8:18
 **/
public class TestEmp {
    public static void main(String[] args) {
        Emp emp = new Emp();
/*        emp.setEname("jack");
        emp.setJob("Engineer");
        System.out.println(emp);*/

        String text = "ename:jack|job:Engineer";
        //通过反射进行Emp对象的赋值
        //1.通过属性
        //2.通过setter
        String[]  str = text.split("\\|");
        for (String nameAndValueText: str) {
            String[] nameAndValue = nameAndValueText.split(":");
            String name = nameAndValue[0];
            String value  = nameAndValue[1];
            //第二步进行赋值操作
            Class cls= emp.getClass();
            attributeSetValue(emp,name,value);

            System.out.println(emp);
        }


    }

    private static void attributeSetValue(Object object, String name, String value) {
        Class cls = object.getClass();
        try {
            Field attributeField = cls.getDeclaredField(name);
            attributeField.setAccessible(true);
            attributeField.set(object,value);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}    
    
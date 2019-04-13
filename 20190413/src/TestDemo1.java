import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-13
 * Time: 9:42
 **/
/*public class TestDemo1 {
    public static void main1(String[] args) {*/

/*
        char[] value = {'a', 'b', 'c', 'd', 'e'};
        String str = new String(value);
        System.out.println(str);

        String str1 = new String(value, 0, 2);
        System.out.println(str1);

        String str2 = "WZM";
        char ch = str2.charAt(0);
        System.out.println(str2);

        char[] ch1 = str2.toCharArray();
        System.out.println(Arrays.toString(ch1));*/


   /*     String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));

*/
    /* String str1 = "Helloworld";
        System.out.println(str1.contains("world"));
        System.out.println(str1.indexOf("Wzm"));
        System.out.println(str1.indexOf("world"));
        System.out.println(str1.indexOf("llo",1));
        System.out.println(str1.lastIndexOf("He"));
        System.out.println(str1.lastIndexOf("Hello",5));
        System.out.println(str1.startsWith("Hello"));
        System.out.println(str1.startsWith("Hello",0));
        System.out.println(str1.endsWith("ld"));*/







    /*public static void main(String[] args) {*/

      /*  String str2 = "WzmHello";
        System.out.println(str2.replaceAll("Wzm","bit"));
        System.out.println(str2.replaceFirst("W","bi"));*/


     /* String str = "super wzm hello bit";
      String [] result = str.split(" ");
        for(String s:result){
            System.out.println(s);
        }
        String [] result2 = str.split(" ",3);
        for(String s:result2){
            System.out.println(s);
        }*/

     /*String str = "192.168.1.1";
     String[] str1 = str.split("\\.");
     for(String s:str1){
         System.out.println(s);
     }*/


   /*  String str = "yuisama：27|yui：25";
     String[] result = str.split("\\|");
     for(int i = 0;i<result.length;i++){
         *//*String [] temp  = result[i].split(":");*//*
         System.out.println(result);
     }*/

     /*   String str = "helloworld";
        System.out.println(str.substring(3));
        System.out.println(str.substring(4,7));
*/



     class  Person{ }
     class  Student{ }
     public class TestDemo1 {
         public static void main(String[] args) {
             fun(new Person());
             fun(new Student());
         }
         public  static void fun (Object obj){
             System.out.println(obj);
         }
     }
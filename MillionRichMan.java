/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-09
 * Time: 13:29
 **/
public class MillionRichMan {
    public static void main(String[] args) {
        long rich = 0;
        long poor = 0;
        for (int i = 0; i < 30 ; i++) {
            rich += 10;
            poor = poor+ (long)Math.pow(2,i);
        }
        System.out.println(rich+"万元"+poor+"分");
    }


//        public static void main(String args[]){
//            System.out.print(10*30+" ");
//            System.out.println((int)Math.pow(2,30)-1);
//        }
}
    
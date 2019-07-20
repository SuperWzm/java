/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-07-20
 * Time: 13:55
 **/
public class RichPoor {
        public static void main(String[] args) {
            long sumRich = 0;
            long sumPoor = 1;
            for (int i = 1; i <= 30; i++) {
                sumRich += 10;
                sumPoor = sumPoor + (long)Math.pow(2,i-1);
            }
            System.out.println(sumRich + "万元" + sumPoor + "分");
        }


//        public static void main(String[] args){
//            long sumRich=0;
//            long sumStranger=0;
//            for(int i=1;i<=30;i++){
//                sumRich+=10;
//                sumStranger=sumStranger+(long)Math.pow(2,i-1);
//            }
//            System.out.print(sumRich+" "+sumStranger);
//        }
}    
    
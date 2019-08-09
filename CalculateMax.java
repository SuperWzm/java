import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-09
 * Time: 13:44
 **/
public class CalculateMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String[] array1 = str.split(",");
            int[] array = new int[str.length()];
            for (int i = 0; i < array1.length; i++) {
                array[i] = Integer.parseInt(array1[i]);
            }
           System.out.println(calculateMax(array));
             }
        }
        public static int calculateMax ( int[] prices){
            int firstBuy = Integer.MIN_VALUE, firstSell = 0;
            int secondBuy = Integer.MIN_VALUE, secondSell = 0;
            for (int curPrice : prices) {
                firstBuy = Math.max(firstBuy, -curPrice);
                firstSell = Math.max(firstSell, firstBuy + curPrice);
                secondBuy = Math.max(secondBuy, firstSell - curPrice);
                secondSell = Math.max(secondSell, secondBuy + curPrice);
            }
            return secondSell;
        }

}
    
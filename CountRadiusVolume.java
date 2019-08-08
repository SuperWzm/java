import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-08
 * Time: 13:40
 **/
public class CountRadiusVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String[] c = s.split(" ");
            double[] b = new double[6];
            for (int i = 0; i < 6; i++) {
                b[i] = Double.parseDouble(c[i]);
            }
            double r = Math.pow(Math.pow((b[3]-b[0]),2)+Math.pow((b[4]-b[1]),2)+Math.pow(b[5]-b[2],2),0.5);
            System.out.printf("%.3f %.3f\n",r,4*Math.acos(-1)*r*r*r/3);
        }
    }
}    
    
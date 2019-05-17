/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-17
 * Time: 17:15
 **/


public class PrimeFactors {

    public static long primeFactors(long number) {
        if (number == 1) {
            return 1;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return primeFactors(number / i);
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(primeFactors(13195));
        System.out.println(primeFactors(600851475143L));
    }
    }
    
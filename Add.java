import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-19
 * Time: 22:20
 **/
public class Add {
    
        private static List<Integer> list = new ArrayList<>();
        private static List<List<Integer>> res = new ArrayList<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                int n = scanner.nextInt();//n
                int m = scanner.nextInt();//m
                fnc(n, m);
                System.out.println(res);
                res = new ArrayList<>();//重置res list
            }
        }

        public static void fnc(int n, int m) {
            if (n < 1 || m < 1)
                return;
            if (m >= n) {
                //放
                list.add(n);
                fnc(n - 1, m - n);
                if (m - n == 0) {//即放入之后刚好凑齐m，记录起来。
                    res.add(new ArrayList<>(list));
                }
                list.remove(list.size() - 1);//这一步是将刚放入的数清除出来（还原list），因为下面不放入该数的情况。
                //不放入
                fnc(n - 1, m);
            } else {
                fnc(m, m);//n> m  大于m的数是不需要考虑的，直接让n = m就行。
            }
        }
    }
    
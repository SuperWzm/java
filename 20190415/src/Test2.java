/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-15
 * Time: 12:44
 **/
public class Test2 {
    public static void main(String[] args) {
        int age[] = {9,7,3,6,2,5,8,1,0,4};
        for(int i =0;i<age.length;i++) {
            for (int j = 0; j < age.length - i - 1; j++) {
                if (age[j] > age[j + 1]) {
                    int temp = age[j];
                    age[j] = age[j + 1];
                    age[j + 1] = temp;
                }
            }
        }
         for(int i = 0;i<age.length;i++){
             System.out.println(age[i]);
             }
        }
    }

    
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-07
 * Time: 19:55
 **/
public class Main {


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            String str = Integer.toBinaryString(num);
            char[] ch = str.toCharArray();
            int j = 0;
            for(int i = 0;i<ch.length;i++){
                if(ch[i] == '0'){
                    j++;
                }
            }
            String str2 = ch.toString().substring(j,ch.length-1);
            char[] ch2 = str2.toCharArray();

            char[] rev = new char[ch2.length];
            int z = 0;
            for(int i = rev.length-1 ;i>=0;i-- ){
                rev[z] = ch2[i];
                z++;
            }
            boolean flag = true;
            for(int k = 0;k<ch2.length;k++){
                if(ch2[k] != rev[k]){
                    flag = false;
                }
            }
            if(flag == false){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
    }
}    
    
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-02
 * Time: 14:24
 **/

//给定一个字符串str,返回str的统计字符串
public class GetCountString {
    public static String getCountString(String str){
        if(str == null || str.equals("")){
            return "";
        }
        char[] ch = str.toCharArray();
        String res = String.valueOf(ch[0]);
        int num =1;
        for (int i = 1; i < ch.length ; i++) {
            if(ch[i] != ch[i-1]){
                res = concat(res,String.valueOf(num),String .valueOf(ch[i]));
                num =1;
            }else{
                num++;
            }
        }
        return concat(res,String.valueOf(num),"");
    }
    public static String concat(String s1,String s2,String s3){
        return s1 + "_" + s2 + (s3.equals("") ? s3 : "_" +s3);
    }

//返回统计字符串所代表的原始字符串上的第index个字符
    public static char getCharAt(String str2,int index){
        if(str2 == null || str2.equals("")){
            return 0;
        }
        char[] ch2 = str2.toCharArray();
        boolean stage = true;
        char cur = 0;
        int num = 0;
        int sum = 0;
        for (int i = 0; i != ch2.length ; i++) {
            if(ch2[i] =='_'){
                stage = !stage;
            }else if(stage){
                sum += num;
                if(sum > index){
                    return cur;
                }
                num = 0;
                cur = ch2[i];
            }else{
                num = num*10+ch2[i] - '0';
            }
        }
        return sum + num > index ? cur : 0 ;
    }


    public static void main(String[] args) {
        System.out.println(getCountString("aaabbadddffc"));
        System.out.println(getCharAt("a_1_b_100",0));
        System.out.println(getCharAt("a_1_b_100",50));
    }
}

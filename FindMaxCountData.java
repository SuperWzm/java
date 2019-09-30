import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-30
 * Time: 18:38
 **/
public class FindMaxCountData {
    public static void main(String[] args) {
        int[] array = {2,3,1,2,2,5,6,8,2,3,2,4,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                int temp = map.get(array[i]);
                map.put(array[i],temp+1);
            }else{
                map.put(array[i],1);
            }
        }

        Collection<Integer> count = map.values();
        int maxCount = Collections.max(count);
        int maxnum = 0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(maxCount == entry.getValue()){
                maxnum = entry.getKey();
            }
        }
        System.out.println("出现最多的是" + maxnum);
        System.out.println("一共出现了" + maxCount);
    }
}    
    
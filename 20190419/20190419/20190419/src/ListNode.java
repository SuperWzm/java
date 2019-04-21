import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-21
 * Time: 10:36
 **/
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }
}
class Solution{
    public ListNode middleNode(ListNode head){
        if(head ==null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return fast = false ?slow:slow.next;
    }
}

/*class Solution {
    public ListNode middle (ListNode head) {
        if(head == null)
            return head;
        ListNode fast =  head, slow = head;
        while(fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
class middleNode {

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if(input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index ++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    public static ListNode stringToListNode(String input) {
        int[] nodeValues = stringToIntegerArray(input);

        ListNode dummyRoot = new  ListNode(0);

        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr= ptr.next;
        }
        return dummyRoot.next;

    }
    public static String listNodeToString(ListNode node) {
        if(node == null) {
            return "[]";
        }
        String result = "";
        while(node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        String line;
        while((line = in.readLine()) != null) {
            ListNode head = stringToListNode(line);

            ListNode ret = new Solution().middle(head);

            String out = listNodeToString(ret);

            System.out.println(out);

        }
    }

}*/
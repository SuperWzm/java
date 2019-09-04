/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-09-04
 * Time: 16:40
 **/
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class BinaryTree {
    public static Boolean isBalanced(TreeNode root){
        if(root == null)  return true;
        int left = get(root.left);
        int right = get(root.right);
        if(Math.abs(left-right) >1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public static int get(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = get(root.left);
        int right = get(root.right);
        return Math.max(left,right) + 1;
    }

}    
    
public class Solution {
    ArrayList<Integer> res = new ArrayList<Integer>();
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        if(A == null) {
            return res;
        }
        inorderTraversal(A.left);
        res.add(A.val);
        inorderTraversal(A.right);
        return res;
    }
}

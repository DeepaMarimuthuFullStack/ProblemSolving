public class Solution {
    public int solve(TreeNode A) {
        if(A == null) {
            return 0;
        }
        return(1 + Math.max(solve(A.left), solve(A.right)));
    }
}

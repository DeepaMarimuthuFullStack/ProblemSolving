/*
Given two binary trees, check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
*/

public class Solution {
    public int isSameTree(TreeNode A, TreeNode B) {
        if(A == null && B == null) {
            return 1;
        } else if(A == null || B == null) {
            return 0;
        } else if(A.val != B.val) {
            return 0;
        } else {
            return isSameTree(A.left, B.left) & isSameTree(A.right, B.right);
        }
    }
}

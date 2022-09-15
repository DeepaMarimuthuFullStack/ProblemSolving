/*
You are given a constant array A.

You are required to return another array which is the reversed form of the input array.
*/
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A) {
        int rev[] = new int[A.length];
        for(int i = 0 ; i < A.length ; i++) {
            rev[i] = A[A.length - i - 1];
        }
        return rev;
    }
}

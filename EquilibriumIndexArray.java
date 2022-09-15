/*
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
*/
public class Solution {
    public int solve(int[] A) {
        int N = A.length;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i < N; i++)
            rightSum += A[i];

        if (leftSum == rightSum)
            return 0;

        for (int i = 1; i < N; i++) {
            leftSum += A[i - 1];
            rightSum -= A[i];
            if (leftSum == rightSum)
                return i;
        }
        return -1;
        
    }
}

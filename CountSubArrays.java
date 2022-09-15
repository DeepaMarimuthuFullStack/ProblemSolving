/*
Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.
*/

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int num = A.size();
        int count = 0;
        for(int i = 0 ; i < num ; i++) {
            int sum = 0;
            for(int j = i ;j < num ; j++) {
                sum = sum + A.get(j);
                if(sum < B) {
                     count++;
                 }
            }
            
        }
        return count;
    }
}

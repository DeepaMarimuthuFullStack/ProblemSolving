/*
You will be given 2 strings (A and B).

You have to lexicigraphically compare two strings and return either 0 or 1 or -1.

0 if both are equal, 1 if A is lexicigraphically greater than B otherwise -1.
*/
public class Solution {
    public int solve(String A, String B) {
        int result = A.compareTo(B);
        // System.out.println("A : " + A + " B : " + B + "Result : " + result);
        if(result == 0){
            return 0;
        }else if(result > 0){
            return 1;
        }
        return -1;
    }
}

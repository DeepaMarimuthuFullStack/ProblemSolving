public class Solution {
    public int solve(int[][] A, int[][] B) {
        int row = A.length;
        int col = A[0].length;
        for(int i = 0 ; i < row ; i++) {
            for(int j = 0 ; j < col ; j++) {
                if(A[i][j] != B[i][j]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}

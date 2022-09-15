public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A, int B) {
        ArrayList addition = new ArrayList<>();
        for(int i = 0 ; i < A.size() ; i++){
            addition.add(A.get(i)+B);
        }
        return addition;
    }
}

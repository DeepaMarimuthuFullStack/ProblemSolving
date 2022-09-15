public class Solution {
    public ArrayList<Integer> solve(String A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int vowels = 0;
        int cons = 0;
        for(int i = 0 ; i < A.length(); i++){
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || 
                A.charAt(i) == 'o' || A.charAt(i) == 'u'){
                    vowels++;
                } else{
                    cons++;
                }
        }
        result.add(vowels);
        result.add(cons);
        return result;
         
    }
}

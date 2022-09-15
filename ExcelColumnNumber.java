public class Solution {
    public int titleToNumber(String A) {
         int number = 0;
        for(int i=0;i<A.length();i++){
            int res = A.charAt(i) - 64;
            number = number * 26 + res ;
        }
        return number;
    }
}

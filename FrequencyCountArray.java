/*
You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .
*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> val =  new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<>();
            for (int i= 0; i<A.size();i++){
                Integer frequeny = (Integer) hm.get(A.get(i));
                if (frequeny ==  null){
                    frequeny =0;
                }
                hm.put(A.get(i), frequeny+1);            
            }
            for (int j= 0; j<A.size();j++){
                  val.add(hm.get((Integer)A.get(j)));
              }
        return val;
    }
}

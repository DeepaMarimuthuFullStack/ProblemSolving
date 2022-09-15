/*
Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single element "-1".

First sub-array means the sub-array for which starting index in minimum.
*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        // ArrayList<Integer> res = new ArrayList<Integer>();
        // for(int i = 0 ; i < A.size() ; i++) {
        //     if(i < A.size()) {
        //         if(A.get(i) + A.get(i+1) == B) {
        //             res.add(A.get(i));
        //             res.add(A.get(i+1));
        //             return res;
        //         }
        //     }
        // }
        // res.add(-1);
        // return res;
        int i = 0 ;
            int j = 0 ;
            long sum = 0 ;
            ArrayList<Integer> resp =  new ArrayList<Integer>();

            while( j < A.size() ){
                sum += A.get(j);
                j++;

                while(sum > B  ){
                    sum = sum - A.get(i);
                    i++;   
                }

                if(sum == B){
                    return new ArrayList<Integer>( A.subList(i,j)) ;
                }
            } 
        resp.add(-1);
        return resp  ;
    }
}

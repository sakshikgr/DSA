package org.example.dynamic_programming;
import java.util.HashMap;

public class LongestSubsetWithKSum {
    public static void main(String[] args) {
        int[] a={0,2,5,3,3,4,4,3,0,5,5,4,4,4,3,2,0,2,3,1,3,0,4,3,1,4,5,2,4,3,1,4,5,0,3,4,0};
        int k=52;
        System.out.println(longestSubarrayWithSumK(a,k));
    }


        public static int longestSubarrayWithSumK(int []a, long k) {
            // Write your code here
            long sum=0;
            int len=0;
            HashMap<Long , Integer> map=new HashMap<>();
            for(int i=0;i<a.length;i++){
                sum+=a[i];
                if(sum==k){
                    len=i+1;
                }

                if(map.containsKey(sum-k)){
                    len=Math.max(i-map.get(sum-k),len);
                }
                if(!map.containsKey(sum)) {
                    map.put(sum, i);
                }
1            }
            return len;
        }

}

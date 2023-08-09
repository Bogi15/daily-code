//leetcode 1748\
import java.util.Hashtable;
class Solution {
    public int sumOfUnique(int[] nums) {
       Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
       int result =0;
       for(int i=0;i<nums.length;i++){
           if(h.containsKey(nums[i])){
               h.put(nums[i], h.get(nums[i]) + 1);
           }
           else{
               h.put(nums[i],1);
           }
       }
        for(int num : h.keySet()) {
            if (h.get(num) == 1) {
                result += num;
            }
        }
        return result;
    }
}

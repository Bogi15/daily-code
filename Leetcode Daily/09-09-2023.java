//leetcode 2148
class Solution {
    public int countElements(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            boolean a = false;
            boolean b = false;
            for(int j=0;j<nums.length;j++){

                if(nums[i]<nums[j]){
                    a = true;
                }
                if(nums[i]>nums[j]){
                    b = true;
                }
                if(a && b){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

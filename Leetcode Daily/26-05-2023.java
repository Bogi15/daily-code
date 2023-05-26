//leetcode 2574 
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left=0,rigth=0,num;
        int [] ans = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                left=0;
                rigth=0;
                for(int j=1;j<nums.length;j++){
                    rigth += nums[j];
                }
            }
            else if(i == nums.length -1){
                rigth = 0;
                left = 0;
                for(int j = nums.length-2;j>=0;j--){
                    left += nums[j];
                }
            }
            else{
                left=0;
                rigth=0;
                for(int j=i-1;j>=0;j--){
                    left += nums[j];
                }
                for(int j=i+1;j<nums.length;j++){
                    rigth += nums[j];
                }
            }
            num = Math.abs(left-rigth);
            ans[i] = num;

        }
        return ans;
    }
}

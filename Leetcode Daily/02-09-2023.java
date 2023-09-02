//leetcode 34
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]= new int[2]; 
        int start=nums.length,end=0;
        boolean b = true;
        if(nums.length==0) return new int [] {-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                start = Math.min(start,i);
                end = Math.max(end,i);
                b=false;
            }

        }if(b){
            return new int [] {-1,-1};
        }
        a[0]=start;
        a[1]=end;

        return a;
    }
}

//leetcode 2455
class Solution {
    public int averageValue(int[] nums) {
        int all=0,br=0;
        for(int num : nums){
            if(num % 2 == 0 && num % 3 == 0){
                all = all + num;
                br++;
            }
        }
        if(br==0) return 0;
        all = all/br;
        return (int) all;
    }
}

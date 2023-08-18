//leetcode 2491
class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int len = skill.length;
        int b = skill[0]+skill[len-1];
        long result=0;
        for(int i=0;i<len/2;i++){
            if(skill[i] + skill[len-1-i] == b){
                result += skill[i] * skill[len-1-i];
            }
            else {
                return -1;   
            }
        }
        return result;
    }
}

//leetcode 771
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result=0;
        for(int i=0;i<jewels.length();i++){
            char c = jewels.charAt(i);
            int a = c - '0';  
            for(int j=0;j<stones.length();j++){
                char d = stones.charAt(j);
                int b = d - '0';  
                if(a == b){
                    result++;
                }
            }
        }
        return result;
    }
}

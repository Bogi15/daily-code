//leetcode 2160
class Solution {
    public int minimumSum(int num) {
        int numbers [] = new int [4];
        for(int i=0;i<4;i++){
            numbers[i]=num%10;
            num /= 10;
        }
        Arrays.sort(numbers);
        return numbers[0] * 10 + numbers[2] + numbers[1] * 10 + numbers[3];
    }
}

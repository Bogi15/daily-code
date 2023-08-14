//leetcode 728
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isDivisible(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public boolean isDivisible(int x) {
        int num = x;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 0 || x % digit != 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }  
}

//leetecode 989
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int cur = k;
        List<Integer> result = new ArrayList();
        int i = n;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += num[i];
            result.add(cur % 10);
            cur /= 10;
        }
        Collections.reverse(result);
        return result;
    } 
}

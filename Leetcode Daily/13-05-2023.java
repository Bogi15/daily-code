//leetcode 1437
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int dist = k;
		for (int i: nums)
		{
			if (i == 0) dist += 1;
			else if (dist < k) return false;
			else dist = 0;
		}
		return true;
    }
}

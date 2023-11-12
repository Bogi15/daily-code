//leetcode 187
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
		int start = 0;
		int end = 10;
		Set<String> seen = new HashSet<>();
		Set<String> result = new HashSet<>();
		while(end <= s.length()) {            
			String x = s.substring(start,end);
			if(seen.contains(x)) {
				result.add(x);
			}
			seen.add(x);
			start++;
			end++;
		}
		return new ArrayList<>(result);
    }
}

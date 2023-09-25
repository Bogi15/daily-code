//leetcode 2215
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        for(int num : nums1)s1.add(num);
        for(int num : nums2)s2.add(num);
        for(int num : nums1){
            if(!s2.contains(num) && !l1.contains(num)){
                l1.add(num);
            }
        }
        for(int num : nums2){
            if(!s1.contains(num) && !l2.contains(num)){
                l2.add(num);
            }
        }
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        l.add(l1);
        l.add(l2);
        return l;
    } 
}

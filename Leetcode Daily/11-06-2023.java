//leetcode 1431
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      Boolean kids [] = new Boolean [candies.length];
      int data [] = candies.clone();
      Arrays.sort(data);
      for(int i=0;i<candies.length;i++){
          if(candies[i]+extraCandies>=data[candies.length-1])kids[i]=true;
          else kids[i]=false;
      }
        List<Boolean> list = Arrays.asList(kids);
        return list;
    }
}

//leetcode 997
class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1)return 1;
        int people[] = new int [n+1];
        for(int person [] : trust){
            people[person[0]]--;
            people[person[1]]++;
        }
        for(int i=0;i<people.length;i++){
            if(people[i]==n-1)return i;
        }
        return -1;
    }
}

//leetcode 2114
class Solution {
    public int mostWordsFound(String[] sentences) {
        int temp=-1;
        for(int i=0;i<sentences.length;i++){
            int br = 0;
            for(int j=0;j<sentences[i].length();j++){
                char c = sentences[i].charAt(j);
                if(c == ' ') br++;
            }
            if(br>temp) temp = br;
        }
        return temp + 1;
    }
}

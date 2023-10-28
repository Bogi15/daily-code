//leetcode 500
class Solution {
    public String[] findWords(String[] words) {
        String a = "QWERTYUIOPqwertyuiop";
        String b = "ASDFGHJKLasdfghjkl";
        String c = "ZXCVBNMzxcvbnm";
        ArrayList<String> d = new ArrayList<>();
        for(String word : words){
            int c1=0,c2=0,c3=0,n=word.length();
            for(int i=0;i<n;i++){
                if(a.contains(Character.toString(word.charAt(i)))) c1++;
                else if(b.contains(Character.toString(word.charAt(i)))) c2++;
                else if(c.contains(Character.toString(word.charAt(i)))) c3++;
                if(c1==n || c2==n || c3==n) d.add(word);
            }
        }
        String result[] = new String [d.size()];
        d.toArray(result);
        return result;
    }
}

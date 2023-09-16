//leetecode 387
import java.util.Hashtable;
class Solution {
    public int firstUniqChar(String s) {
        Hashtable<Character, Integer> x = new Hashtable<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(x.containsKey(c)){
                x.replace(c,x.get(c)+1);
            }
            else {
                x.put(c,1);
            }
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(x.get(c) == 1 ) return i;
        }
        return -1;
    }
}

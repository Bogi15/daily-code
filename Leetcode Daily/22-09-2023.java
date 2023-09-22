//leetcode 1078
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] a = text.split(" ");
        List<String> list = new ArrayList<String>();
        int i=0,n=a.length;
        while(i<n)
        {
            if(a[i].equals(first))
                if(i+1<n-1 && a[i+1].equals(second))
                    list.add(a[i+2]);
            i++;
        }

        return list.toArray(new String[0]);
    }
}

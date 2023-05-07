//leetcode 412
class Solution {
    public List<String> fizzBuzz(int n) {
      LinkedList <String> l = new LinkedList <String>();
			for(int i=1;i<=n;i++) {
				if(i%5==0 && i%3==0) l.add("FizzBuzz");
				else if (i%3==0) l.add("Fizz");
				else if (i%5==0) l.add("Buzz");
				else l.add(Integer.toString(i));
			}
			return l;
		}
}

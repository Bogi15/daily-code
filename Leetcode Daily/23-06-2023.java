//leetcode 
public class MaxCandies {
    public int maxCandies(int[] candyType) {
        Set<Integer> uniqueCandyTypes = new HashSet<>();

        for (int candy : candyType) {
            uniqueCandyTypes.add(candy);
        }

        return Math.min(uniqueCandyTypes.size(), candyType.length / 2);
    }
}

public class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int maxDistance = 0;
        int minSofar = arrays.get(0).get(0);
        int maxSofar = arrays.get(0).get(arrays.get(0).size() - 1);

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> currentArray = arrays.get(i);
            int currentMin = currentArray.get(0);
            int currentMax = currentArray.get(currentArray.size() - 1);

            // Calculate the maximum distance
            maxDistance = Math.max(maxDistance, maxSofar - currentMin);
            maxDistance = Math.max(maxDistance, currentMax - minSofar);

            // Update the global min and max
            minSofar = Math.min(minSofar, currentMin);
            maxSofar = Math.max(maxSofar, currentMax);
        }

        return maxDistance;
    }
}
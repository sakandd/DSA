class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1); // Base case: there's one way to have a sum of 0 (with an empty subarray)
        int currentSum = 0;
        int result = 0;

        for (int num : nums) {
            currentSum += num;
 // If currentSum - goal exists in the map, it means there are subarrays that sum to S
  if (sumCount.containsKey(currentSum - goal)) {
                result += sumCount.get(currentSum - goal);
            }

            // Update the frequency of the currentSum in the map
    sumCount.put(currentSum, sumCount.getOrDefault(currentSum, 0) + 1);
        }

        return result;
    }
}
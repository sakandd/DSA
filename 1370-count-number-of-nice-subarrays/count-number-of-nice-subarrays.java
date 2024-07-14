public class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // HashMap to store the frequency of prefix sums
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // Initialize with 0 to handle cases where the subarray starts from index 0
        
        int count = 0;
        int currentOddCount = 0;
        
        for (int num : nums) {
            // Increment the odd count if the current number is odd
            if (num % 2 != 0) {
                currentOddCount++;
            }
            
            // Check if there is a prefix with currentOddCount - k
            if (prefixCount.containsKey(currentOddCount - k)) {
                count += prefixCount.get(currentOddCount - k);
            }
            
            // Update the prefix count in the hashmap
            prefixCount.put(currentOddCount, prefixCount.getOrDefault(currentOddCount, 0) + 1);
        }
        
        return count;
    }
}
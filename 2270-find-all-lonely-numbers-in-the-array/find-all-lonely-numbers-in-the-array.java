class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> lonelyNumbers = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Step 1: Count occurrences of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find lonely numbers
        for (int num : nums) {
            // Check if the current number appears exactly once
            if (countMap.get(num) == 1) {
                // Check if neither num - 1 nor num + 1 are in the map
                if (!countMap.containsKey(num - 1) && !countMap.containsKey(num + 1)) {
                    lonelyNumbers.add(num);
                }
            }
        }

        return lonelyNumbers;
    }
}
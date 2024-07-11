
class Solution {
    public int[] moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Pointer for the position to place the next non-zero element

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap the current element with the element at nonZeroIndex
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;

                // Move the nonZeroIndex to the next position
                nonZeroIndex++;
            }
        }
        return nums; // Return the modified array
    }
}
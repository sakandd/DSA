public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // Calculate mid index
            int mid = left + (right - left) / 2;

            // Ensure mid is even to correctly compare pairs
            if (mid % 2 == 1) {
                mid--;
            }

            // Compare mid and mid + 1
            if (nums[mid] == nums[mid + 1]) {
                // Single element must be in the right half
                left = mid + 2;
            } else {
                // Single element must be in the left half
                right = mid;
            }
        }

        // Return the single element
        return nums[left];
    }
}
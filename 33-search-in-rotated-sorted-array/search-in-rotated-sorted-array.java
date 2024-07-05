class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            }

            // Determine which side is properly sorted
            if (nums[start] <= nums[mid]) { // Left side is sorted
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1; // Target is in the left sorted part
                } else {
                    start = mid + 1; // Target is in the right part
                }
            } else { // Right side is sorted
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1; // Target is in the right sorted part
                } else {
                    end = mid - 1; // Target is in the left part
                }
            }
        }

        return -1; // target not found
    }
}

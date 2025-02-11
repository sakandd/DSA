class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int maxLength = 0;
        int start = 0, end = 0;

        char[] arr = s.toCharArray(); // Convert string to character array

        // Check all substrings using two loops (similar to subarray problems)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (isPalindrome(arr, i, j)) {
                    int length = j - i + 1;
                    if (length > maxLength) {
                        maxLength = length;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }

    // Helper function to check if a substring is a palindrome (Iterative)
    private boolean isPalindrome(char[] arr, int start, int end) {
        while (start < end) {
            if (arr[start] != arr[end]) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String str = "babad";
        System.out.println(sol.longestPalindrome(str)); // Output: "bab" or "aba"
    }
}

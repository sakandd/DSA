class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        
        int n = s.length();
        int maxLength = 0;
        String longestPalindrome = "";
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = s.substring(i, j);
                if (isPalindrome(substring) && substring.length() > maxLength) {
                    maxLength = substring.length();
                    longestPalindrome = substring;
                }
            }
        }
        
        return longestPalindrome;
    }
    
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}

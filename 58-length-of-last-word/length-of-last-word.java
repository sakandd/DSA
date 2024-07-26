class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean foundNonSpace = false;
        
        // Traverse the string from end to start
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            
            if (c != ' ') {
                // Count characters of the last word
                count++;
                foundNonSpace = true;
            } else if (foundNonSpace) {
                // If a space is encountered after counting some characters, return the count
                return count;
            }
        }
        
        return count;
    }
}

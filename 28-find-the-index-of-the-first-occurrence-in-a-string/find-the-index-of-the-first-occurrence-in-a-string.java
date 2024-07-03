class Solution {
    public int strStr(String haystack, String needle) {
        int hlength = haystack.length();
        int nlength = needle.length();
        
        for (int i = 0; i <= hlength - nlength; i++) {
            int j;
            for (j = 0; j < nlength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == nlength) {
                return i;
            }
        }
        return -1;
    }
}

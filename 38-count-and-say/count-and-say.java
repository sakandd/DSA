class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        
        String previousTerm = countAndSay(n - 1);
        return buildNext(previousTerm);
    }
    
    private String buildNext(String s) {
        StringBuilder nextTerm = new StringBuilder();
        int count = 1;
        char currentChar = s.charAt(0);
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                nextTerm.append(count).append(currentChar);
                currentChar = s.charAt(i);
                count = 1;
            }
        }
        nextTerm.append(count).append(currentChar);
        
        return nextTerm.toString();
    }
}

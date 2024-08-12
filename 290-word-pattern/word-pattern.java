class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Split the string into words
        String[] words = s.split(" ");
        
        // Check if lengths match
        if (pattern.length() != words.length) {
            return false;
        }
        
        // Maps to store character-to-word and word-to-character relationships
        Map<Character, String> charToWordMap = new HashMap<>();
        Map<String, Character> wordToCharMap = new HashMap<>();
        
        // Iterate through pattern and words
        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = pattern.charAt(i);
            String word = words[i];
            
            // Check the character-to-word mapping
            if (charToWordMap.containsKey(patternChar)) {
                if (!charToWordMap.get(patternChar).equals(word)) {
                    return false; // Inconsistent mapping
                }
            } else {
                charToWordMap.put(patternChar, word);
            }
            
            // Check the word-to-character mapping
            if (wordToCharMap.containsKey(word)) {
                if (wordToCharMap.get(word) != patternChar) {
                    return false; // Inconsistent mapping
                }
            } else {
                wordToCharMap.put(word, patternChar);
            }
        }
        
        return true; // All mappings are consistent
    }
}
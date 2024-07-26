class Solution {
    public String sortSentence(String s) {
        // Split the sentence into words
        String[] words = s.split(" ");
        // Create an array to store words in their correct positions
        String[] sortedWords = new String[words.length];
        
        // Process each word to place it in the correct position
        for (String word : words) {
            // The position number is the last character of the word
            int position = word.charAt(word.length() - 1) - '0';
            // Store the word without the last character in the sorted array
            sortedWords[position - 1] = word.substring(0, word.length() - 1);
        }
        
        // Join the sorted words into a single string and return
        return String.join(" ", sortedWords);
    }
}

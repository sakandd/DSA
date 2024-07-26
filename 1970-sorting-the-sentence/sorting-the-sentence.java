public class Solution {
    public String sortSentence(String s) {
        // Split the input sentence into words
        String[] words = s.split(" ");
        // Create an array to hold the sorted words
        String[] sortedWords = new String[words.length];
        
        // Iterate over each word
        for (String word : words) {
            // Extract the position of the word (the last character of the word)
            int position = word.charAt(word.length() - 1) - '0';
            // Place the word in the correct position (0-indexed)
            sortedWords[position - 1] = word.substring(0, word.length() - 1);
        }
        
        // Join the sorted words into a single string with spaces
        return String.join(" ", sortedWords);
    }
}

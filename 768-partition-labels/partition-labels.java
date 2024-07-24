public class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> partitions = new ArrayList<>();

        for (int i = 0; i < s.length();) {
            int startIndex = i;
            int lastIndex = s.lastIndexOf(s.charAt(startIndex));

            for (int j = startIndex + 1; j < lastIndex; j++) {
                int lastIndexNextChar = s.lastIndexOf(s.charAt(j));
                if (lastIndexNextChar > lastIndex) {
                    lastIndex = lastIndexNextChar;
                }
            }

            partitions.add(lastIndex - startIndex + 1);
            i = lastIndex + 1;
        }

        return partitions;
    }
}
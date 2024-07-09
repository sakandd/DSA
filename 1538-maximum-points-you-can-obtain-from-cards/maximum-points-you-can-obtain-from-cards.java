class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int left = 0;
        int right = 0;
        int currentsum = 0;
        for(int i = 0; i<k;i++){
            currentsum += cardPoints[i];

        }
        int maxsum = currentsum;
    for(int i = 0; i<k; i++){
        currentsum -= cardPoints[k-1-i];
        currentsum += cardPoints[n-1-i];
        maxsum = Math.max(maxsum , currentsum);
    }
    return maxsum;
}
}


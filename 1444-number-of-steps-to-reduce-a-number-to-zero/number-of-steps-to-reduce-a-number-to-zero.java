class Solution {
    public int numberOfSteps(int num) {
         return numberOfstepshelper(num, 0);
     }
     static int numberOfstepshelper(int num , int steps){
//        Base case
        if (num==0){
            return steps;
        }
        if (num%2==0){
            return numberOfstepshelper(num/2    , steps+1) ;
        }else {
            return numberOfstepshelper(num-1 , steps+1);
        }
    }
}

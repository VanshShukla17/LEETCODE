class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMax = 0;
        int curMin = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int totalSum = 0;
        
        for(int n : nums){
            curMax = Math.max(n , curMax+n);
            maxSum = Math.max(maxSum , curMax);
            
            curMin = Math.min(n , curMin+n);
            minSum = Math.min(minSum , curMin);            
            
            totalSum+=n;
            
        }
        
        if(maxSum < 0){
            return maxSum;
        }
        
        return Math.max(maxSum , totalSum - minSum);
        
    }
}
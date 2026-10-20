class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int curMax = 0;
        int curMin = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        
        for(int n : nums){
            curMax = Math.max(n , curMax+n);
            maxSum = Math.max(maxSum , curMax);
            
            curMin = Math.min(n , curMin+n);
            minSum = Math.min(minSum , curMin);            
            
            
        }
        
        return Math.max(maxSum , Math.abs(minSum));
        
    }
}
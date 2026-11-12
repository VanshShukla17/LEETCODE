class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;
        int n = nums.length;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0 ; i < n ; i++){
            int pick = nums[i] + prev1;
            int notpick = prev2;
            int cur = Math.max(pick , notpick);
            prev1 = prev2;
            prev2 = cur;
        }       
    return prev2;
    }
}
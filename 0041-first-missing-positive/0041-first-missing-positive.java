class Solution {
    public int firstMissingPositive(int[] nums) {
        int []freq = new int[nums.length+1];
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0 && nums[i]<=nums.length){
                freq[nums[i]] = 1;
            }
        }
        for(int i=1;i<=n;i++){
            if(freq[i]==0){
                return i;
            }
        }
    return nums.length+1;
    }
}
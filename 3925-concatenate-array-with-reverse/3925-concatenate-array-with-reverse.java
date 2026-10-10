class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans[] = new int[nums.length*2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            ans[j] = nums[i];
            j++;
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[j] = nums[i];
            j++;
        }
    return ans;
    }
}
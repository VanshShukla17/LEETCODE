class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int sum = 0;

        for(int num : nums){
            sum += num;
        }

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int right = sum - num - left;
            if(left == right){
                return i;
            }
            left += num;
        }
        return -1;
    }
}
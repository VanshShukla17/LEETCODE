class Solution {
    public int findClosestNumber(int[] nums) {
        int closest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(closest)>0+Math.abs(nums[i])){
                closest=nums[i];
            }
            if(Math.abs(closest)==Math.abs(nums[i])){
                if(nums[i]>0){
                    closest=nums[i];
                }
            }
        }
    return closest;
    }
}
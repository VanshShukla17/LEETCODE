class Solution {
    public boolean canAliceWin(int[] nums) {
        int aliceSum = 0;
        int bobSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 9){
                aliceSum+=nums[i];
            }
            else{
                bobSum+=nums[i];
            }
        }
        boolean case1 = aliceSum>bobSum;
        aliceSum = 0;
        bobSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 9){
                bobSum+=nums[i];
            }
            else{
                aliceSum+=nums[i];
            }
        }
        boolean case2 = aliceSum>bobSum;
    return case1 || case2;
    }
}
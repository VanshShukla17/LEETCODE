class Solution {
    public int minPairSum(int[] nums) {

        // dekho bhai simple hai pair aese banana hai ek chota or ek bada number lekar
        // to kya sort karo or first smallest + first largest then  second smallest + second largest or comapre karte jao kon max hai.
        Arrays.sort(nums);
        int i = 0 ;
        int j = nums.length-1;
        int sum = 0 ;
        int max = 0;
        while(i<=j){
            sum = nums[i] + nums[j];
            max = Math.max(sum ,max);
            i++;
            j--;
        }
    return max;
    }
}
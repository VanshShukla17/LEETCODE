class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int freq[] = new int[100];
        int ans[] = new int[2];
        for(int i=0;i<nums.length ; i++){
            freq[nums[i]]++;
        }
        int index=0;
        for(int i=0;i<freq.length ; i++){
            if(freq[i]==2){
                ans[index]=i;
                index++;
            }
        }
    return ans;
    }
}
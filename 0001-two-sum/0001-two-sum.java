class Solution {
    public int[] twoSum(int[] nums, int target) {
        int complement;
        int i;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<nums.length;i++){
            complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int []{map.get(complement),i};
            }
        
        map.put(nums[i],i);}
        return new int []{0,0};
}
}
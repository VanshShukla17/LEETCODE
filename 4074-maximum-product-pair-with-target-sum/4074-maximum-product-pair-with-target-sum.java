class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = {-1,-1};
        long maxProduct =Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                int j = map.get(needed);
                long product =(long)nums[i] * needed;

               if (nums[i] > needed && product > maxProduct) {
                    maxProduct = product;
                    res[0] = i;
                    res[1] = j;
                }  else if (needed > nums[i] && product > maxProduct) {
                    maxProduct = product;
                    res[0] = j;
                    res[1] = i;
    }
}
        map.put(nums[i],i);
            }
    return res;
        }
    }
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int largeSeq = 0;
        int count = 0;
        for(int num : nums){
            set.add(num);
        }

        for(int n : set){
            if(!set.contains(n-1)){
                int cur = n;
                count = 1;

                while(set.contains(cur + 1)){
                    cur++;
                    count++;
                }
            }
            largeSeq = Math.max(largeSeq , count);
        }
    return largeSeq;
    }
}
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> ds = new ArrayList<>();
        int n = nums.length;
        int i = 0;

        subs2(ans,ds,i,n,nums);
    return new ArrayList<>(ans);
    }
    public static void subs2(Set<List<Integer>> ans , List<Integer> ds, int i ,int n, int[] arr){
        if(i==n){
            List<Integer> temp = new ArrayList<>(ds);
            Collections.sort(temp);
            ans.add(new ArrayList<>(temp));
            return;
        }
        ds.add(arr[i]);
        subs2(ans , ds , i+1 , n , arr);
        ds.removeLast();
        subs2(ans , ds , i+1 ,n , arr);
    }
}
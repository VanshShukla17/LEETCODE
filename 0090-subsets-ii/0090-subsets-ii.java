class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        Arrays.sort(nums);
        subs2(ans,ds,i,n,nums);
    return  ans;
    }
    public static void subs2(List<List<Integer>> ans , List<Integer> ds, int i ,int n, int[] arr){
        ans.add(new ArrayList<>(ds));
        for(int ind = i ; ind < arr.length ; ind++){
        if( ind > i && arr[ind] == arr[ind-1]){
            continue;
        }

            ds.add(arr[ind]);
            subs2(ans,ds,ind+1,n,arr);
            ds.removeLast();
        }
    }
}
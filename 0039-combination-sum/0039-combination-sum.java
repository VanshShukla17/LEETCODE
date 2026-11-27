class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int i = 0;
        int n = candidates.length;
        comb(ds, ans, i, n, target, candidates);
        return ans;
    }

    public static void comb(List<Integer> ds , List<List<Integer>> ans , int i , int n ,int target, int[] arr){
        if(i==arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
        return;
        }
        if(arr[i] <= target){
            ds.add(arr[i]);
            comb(ds,ans,i,n,target-arr[i],arr);
            ds.removeLast();
        }
        comb(ds,ans,i+1,n,target,arr);
    }
}
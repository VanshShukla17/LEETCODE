class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int ind = 0;
        Arrays.sort(candidates);
        int n = candidates.length;
        comb2(ds, ans, ind, n, target, candidates);
        return ans;
    }
    public static void comb2(List<Integer> ds , List<List<Integer>> ans , int ind , int n ,int target, int[] arr){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            return;
            }
        for(int i = ind ; i <arr.length ;i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            ds.add(arr[i]);
            comb2(ds,ans , i+1 , n , target-arr[i] , arr);
            ds.removeLast();
        } 
    }
}
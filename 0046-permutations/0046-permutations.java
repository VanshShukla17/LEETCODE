class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int n = nums.length;
        int ind = 0;
        boolean[] visited = new boolean[n];
        perm(ans ,ds , n , ind , visited , nums);
    return ans;
    }

    public static void perm(List<List<Integer>> ans , List<Integer> ds, int n,int ind ,boolean[] visited ,int[] arr){
        if(ds.size() == n){
            ans.add(new ArrayList<>(ds));
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(!visited[i]){
                ds.add(arr[i]);
                visited[i] = true;
                perm(ans,ds,n,ind,visited,arr);
                ds.removeLast();
                visited[i] = false;
            }
        }
    }

}
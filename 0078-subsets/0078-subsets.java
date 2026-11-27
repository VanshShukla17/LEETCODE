class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int n = nums.length;
        int i = 0;

        subs(ans,ds,i,n,nums);
    return ans;
    }
    public static void subs(List<List<Integer>> ans,List<Integer> ds,int i ,int n,int[] arr){
        if(i==n){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[i]);
        subs(ans,ds,i+1,n,arr);
        ds.removeLast();
        subs(ans,ds,i+1,n,arr);
    }
}
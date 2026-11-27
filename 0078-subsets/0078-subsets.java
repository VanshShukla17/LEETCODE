class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> fls = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        int n = nums.length;
        int i = 0;

        subs(fls,ls,i,n,nums);
    return fls;
    }
    public static void subs(List<List<Integer>> fls,List<Integer> ls,int i ,int n,int[] arr){
        if(i==n){
            List temp = new ArrayList<>(ls);
            Collections.sort(temp);
            fls.add(new ArrayList<>(temp));
            return;
        }
        ls.add(arr[i]);
        subs(fls,ls,i+1,n,arr);
        ls.removeLast();
        subs(fls,ls,i+1,n,arr);
    }
}
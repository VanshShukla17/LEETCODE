class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> ls1=new ArrayList<>();
        int sum=0;
        int idx=0;
        int n=candidates.length;
        comb(ls,ls1,sum,0,n,target,candidates);
    return ls;
    }

    public static void comb(List<List<Integer>> ls,List<Integer> ls1 ,int sum , int idx, int n , int target, int[] arr){

        if(idx==n){
            if(sum==target){
                ls.add(new ArrayList<>(ls1));
            }
                return;
        }
            if(sum+arr[idx]<=target){
                sum+=arr[idx];
                ls1.add(arr[idx]);
                comb(ls,ls1,sum,idx,n,target,arr);
                sum-=arr[idx];
                ls1.remove(ls1.size()-1);
            }
            comb(ls,ls1,sum,idx+1,n,target,arr);
        }
    }
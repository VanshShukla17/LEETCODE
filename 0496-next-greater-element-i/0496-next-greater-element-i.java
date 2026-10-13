class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mapNge = new HashMap<>();
        Stack<Integer> stk = new Stack<>();

        for(int i = nums2.length-1 ; i>=0 ;i--){
            while(!stk.isEmpty() && stk.peek()<=nums2[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                mapNge.put(nums2[i],-1);
            }
            else{
                mapNge.put(nums2[i],stk.peek());
            }
        stk.push(nums2[i]);
        }
        int[] nge = new int[nums1.length];
        for(int i = 0 ; i < nums1.length ; i++){
            nge[i] = mapNge.get(nums1[i]);
        }
    return nge;
    }
}
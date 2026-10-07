class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[nums1.length];
        int index = 0;
            for(int num:nums1){
                set.add(num);
            }
            for(int num2:nums2){
                if(set.contains(num2)){
                    arr[index]=num2;
                    index++;
                    set.remove(num2);
            }
        }
        int[] finalAns = new int[index];
        for(int i =0 ; i<index ; i++){
            finalAns[i] = arr[i];
        }
    return finalAns;
    }
}
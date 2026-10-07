class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[nums1.length];
        int index = 0;
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num2: nums2){
            if(map.containsKey(num2) && map.get(num2) > 0){
                arr[index]= num2;
                map.put(num2,map.get(num2)-1);
                index++;
            }
        }
        int[] finalAns = new int[index];
        for(int i =0 ; i<index ; i++){
            finalAns[i] = arr[i];
        }
    return finalAns;
    }
}
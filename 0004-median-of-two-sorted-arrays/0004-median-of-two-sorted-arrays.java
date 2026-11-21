class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int m=nums1.length;
        int n=nums2.length;
        List<Integer> al=new ArrayList<Integer>();

        while (i<m && j<n) {
            if(nums1[i]<nums2[j]){
                    al.add(nums1[i]);
                i++;
            }
            else if (nums1[i]>nums2[j]) {
                    al.add(nums2[j]);
                j++;
            }

            else{
                    al.add(nums1[i]);
                    al.add(nums2[j]);
                
                i++;
                j++;
            }
        }

        while(i<m){
                al.add(nums1[i]);
            
            i++;
        }

        while(j<n){
                al.add(nums2[j]);
            
            j++;
        }
        int size = al.size();

        if(size % 2 == 1) {
            return al.get(size / 2);
        }
        else {
            return (al.get(size / 2) + al.get((size / 2) - 1)) / 2.0;
        }


    }
}
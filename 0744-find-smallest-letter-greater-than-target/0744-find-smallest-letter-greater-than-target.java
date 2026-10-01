class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return search(letters , target);
    }
    public static char search(char [] arr, char target){
        int low=0;
        int high=arr.length-1;
        char res='1';
        while(low<=high){
            int mid = low+(high - low)/2;
            if( arr[mid] <= target){
                low = mid + 1;
            }
            else if( arr[mid]>target){
                res=arr[mid];
                high = mid-1;
            }
        }
        if(res=='1'){
            return arr[0];
        }
    return res;
    }
}
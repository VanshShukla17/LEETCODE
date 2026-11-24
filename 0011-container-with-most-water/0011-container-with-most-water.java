class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;

        int i = 0 ;
        int j = height.length-1;

        while(i<j){
            if(height[i] <= height[j]){
                int check = (j-i)*height[i];
                if(check>max){
                    max = check;
                }
            i++;
            }
            else{
                int check = (j-i)*height[j];
                if(check>max){
                    max = check;
                }
            j--;
            } 
        }
    return max;
        }
    }

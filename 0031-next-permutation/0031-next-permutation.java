class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return;
        }
        int pivot = n - 2;

        while (pivot >= 0 && nums[pivot] >= nums[pivot + 1]) {
            pivot--;
        }

        if (pivot < 0) {
            Arrays.sort(nums);
            return;
        }

        int successor = pivot + 1;

        for (int index = pivot + 1; index < n; index++) {
            if (nums[index] > nums[pivot] && nums[index] <= nums[successor]) {
                successor = index;
            }
        }
        int temporary = nums[pivot];
        nums[pivot] = nums[successor];
        nums[successor] = temporary;
        Arrays.sort(nums, pivot + 1, n);
    }
}
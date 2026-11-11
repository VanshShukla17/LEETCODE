class Solution {
    public int countTriplets(int[] arr) {
        int[] prefixXor = new int[arr.length + 1];
        prefixXor[0] = 0;
        for (int i = 1; i <= arr.length; i++) {
            prefixXor[i] = arr[i - 1];
        }
        int n = prefixXor.length;
        for (int i = 1; i < n; i++) {
            prefixXor[i] ^= prefixXor[i - 1];
        }
        int triplets = 0;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (prefixXor[i] == prefixXor[k]) {
                    triplets += k - i - 1;
                }
            }
        }
        return triplets;
    }
}
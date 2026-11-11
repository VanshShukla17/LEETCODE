class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        byte[] cts = new byte[n + 1];
        int tot = 0;
        for (int i = 0; i < n ; i++) {
            tot += cts[A[i]]++;
            tot += cts[B[i]]++;
            A[i] = tot;
        }
        return A;
    }
}
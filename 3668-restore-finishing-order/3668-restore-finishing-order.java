class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:friends){
            set.add(n);
        }
        int finish[] = new int[friends.length];
        int index = 0;
        for(int n1 : order){
            if(set.contains(n1)){
                finish[index]=n1;
                index++;
            }
        }
    return finish;
    }
}
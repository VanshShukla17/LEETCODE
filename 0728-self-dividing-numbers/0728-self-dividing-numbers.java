class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls = new ArrayList<>();
        for(int i=left ;i<=right ;i++){
            if(self(i)){
                ls.add(i);
            }
        }
    return ls;
    }
    public boolean self(int num){
        int count=0;
        if(num<10){
            return true;
        }
        int real=num;
        while(num>0){
            int div=num%10;
            if(div==0){
                return false;
            }
            if(real%div==0){
                count++;
            }
            else{
                return false;
            }
            num=num/10;
        }
    return true;
}
}
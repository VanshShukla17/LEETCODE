class Solution {
    public int addDigits(int num) {
        int add=0;
        if(num<10){
            return num;
        }


        while(num>=10){
        add=0;
        while(num>0){
            add+=num%10;
            num=num/10;
        }
        num=add;
        }
    return add;
    }
}
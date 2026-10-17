class Solution {
    public boolean judgeCircle(String moves) {
      int countVertical = 0;
      int countHorizontal = 0;
      for(int i = 0 ; i<moves.length() ; i++){
        if(moves.charAt(i) == 'U'){
            countVertical++;
        }
        else if(moves.charAt(i) == 'D'){
            countVertical--;
        }
        else if(moves.charAt(i) == 'L'){
            countHorizontal++;
        }
        else{
            countHorizontal--;
        }
      }   
    return countVertical==0 && countHorizontal == 0;
    }
}
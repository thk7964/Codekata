class Solution {
    public String solution(int[] food) {
        String answer = "";
        String left="";
        for (int i= 1; i<food.length; i++){
           for (int j = 0; j < food[i]/2; j++) {
                left += Integer.toString(i);
            }
        }
        for(int i=left.length()-1; i>=0; i-- ){
          answer+=left.charAt(i);              
        }
        return left + 0 +answer;
    }
}
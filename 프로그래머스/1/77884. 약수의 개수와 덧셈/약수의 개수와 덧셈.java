class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt=0;
        for(int i = 0; i<(right-left+1); i++){
             cnt=0;
            for(int j=1;j<=(left+i);j++){
                if((left+i)%j==0 && (left+i)<=right){
                    cnt++;   
                }
            }
            if(cnt%2 == 0){
               answer+=(left+i);
            }else{
                answer-=(left+i);
            }
           
        }
        return answer;
    }
}
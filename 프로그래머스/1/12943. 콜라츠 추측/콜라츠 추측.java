class Solution {
    public int solution(int num) {
        int answer = 0;
        long n =num;
        int cnt=0;
        while(n != 1){
           if(cnt == 500){
               answer=-1;
               return answer; 
           }
            else if (n % 2 == 0){
               n /= 2;
               cnt++;
           }else if(n == 1 && cnt == 0){
               answer=0;
               return answer;
           }else{
               n= (n *3) +1;
               cnt++;
           }
        
        }
        answer = cnt;
        return answer;
    }
}
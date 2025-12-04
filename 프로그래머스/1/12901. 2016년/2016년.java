class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int tot=0;
        
        for(int i= 0; i<(a-1); i++){
            tot+= days[i];
        }
        tot+= b;
        
        String[] week ={"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        answer =week[(tot-1)%7];
        return answer;
    }
}
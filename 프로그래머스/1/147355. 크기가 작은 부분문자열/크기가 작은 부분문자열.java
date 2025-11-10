class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i=0; i<= t.length()-p.length();i++){
            Long val=Long.parseLong(t.substring(i, (p.length()+i)));
            
            if (val<=Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}
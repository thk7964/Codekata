class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int paint =0;
        
        for (int p : section){
            
            if (p>paint){
                answer ++;
                
                paint= p+m-1;
            }
            
        }
        
        return answer;
    }
}
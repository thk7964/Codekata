class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int sub=0;
        for(int i=0; i<a.length; i++){
            sub= a[i]*b[i];
            answer+=sub;
            
        }
        
        return answer;
    }
}
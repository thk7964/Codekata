class Solution {
    public int[] solution(long n) {
        int x = String.valueOf(n).length();
        int[] answer =new int[x];
        int cnt= 0;
        
        while (n > 0) {
            answer[cnt]= (int) (n % 10);
            n /= 10;
            cnt++;
        }
        return answer;
    }
}
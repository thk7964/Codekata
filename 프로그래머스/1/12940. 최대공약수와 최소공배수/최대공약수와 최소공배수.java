
class Solution {
    int gcd (int n,int m){
    while(m > 0){
        int x = m;
        m = n % m;
        n = x;
    }
    return n;
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n, m);
        answer[1] = (n * m) /answer[0];
        
        return answer;
    }
}
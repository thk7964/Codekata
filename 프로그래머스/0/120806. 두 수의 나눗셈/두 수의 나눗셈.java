class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double r= (double) num1 / num2 * 1000;
        answer =(int) r;
        return answer;
    }
}
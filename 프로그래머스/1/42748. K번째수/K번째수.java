import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int c = 0; c < commands.length; c++) {
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];
            // array에서 i-1 ~ j-1 까지 잘라서 새 배열 생성
            int[] x = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(x);
            answer[c] = x[k - 1];
        }

        return answer;
    }
}
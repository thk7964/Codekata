import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> a = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (a.containsKey(ch)) {
                answer[i] = i - a.get(ch);
            } else {
                answer[i] = -1;
            }

            a.put(ch, i);
        }

        return answer;
    }
}
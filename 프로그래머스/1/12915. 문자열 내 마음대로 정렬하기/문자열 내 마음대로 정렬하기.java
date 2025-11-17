class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                char c1 = strings[i].charAt(n);
                char c2 = strings[j].charAt(n);
//compareTo 사전적으로 비교 
                if (c1 > c2 || (c1 == c2 && strings[i].compareTo(strings[j]) > 0)) {
                    String a = strings[i];
                    strings[i] = strings[j];
                    strings[j] = a;
                }
            }
        }
        answer = strings;
        return answer;
    }
}
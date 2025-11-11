class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') { 
                if (c + n > 'Z') { 
                    c = (char)(c - 26 + n); 
                } else {
                    c = (char)(c + n);
                }
            } else if (c >= 'a' && c <= 'z') {
                if (c + n > 'z') {
                    c = (char)(c - 26 + n); 
                } else {
                    c = (char)(c + n);
                }
            } 
            answer+=(char)c;
        }
        System.out.print(answer);
        return answer;
    }
}
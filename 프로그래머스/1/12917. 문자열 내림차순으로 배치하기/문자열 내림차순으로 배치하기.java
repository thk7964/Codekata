import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        List<String> a = new ArrayList<>();
        
        for(int i=0;i<s.length();i++) {            
            a.add(String.valueOf(s.charAt(i)));
        }
        Collections.sort(a, Collections.reverseOrder());
        answer=String.join("",a);
        
        return answer;
    }
}
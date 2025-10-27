import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        List<String> a = new ArrayList<>();
        
        for(int i=0;i<s.length();i++) {            
            a.add(String.valueOf(s.charAt(i)));
        }
        a.sort(Comparator.reverseOrder());
        answer=String.join("",a);
        
        return answer;
    }
}
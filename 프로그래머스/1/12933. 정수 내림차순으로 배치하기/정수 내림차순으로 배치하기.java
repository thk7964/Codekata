import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        ArrayList<Long> str= new ArrayList<>();
        
        while (n > 0) {
            str.add(n % 10);
            n /= 10;      
              
        }
        str.sort((a, b) -> Long.compare(b, a)); 
        
        for (long num : str) {
            answer = answer * 10 + num;
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int z=x;
        ArrayList<Integer> str= new ArrayList<>();
        while (z > 0) {
            str.add(z % 10);
            z /= 10;        
        }
        int y=0;
        System.out.println(str);
        for (int i=0; i<str.size(); i++){
           y += str.get(i);
        }
        System.out.println(y);
        if (x%y == 0 ){
            return answer;
        }else{
            answer = false;
            return answer;
        }
    }
}
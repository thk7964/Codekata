import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};

        int aScore =0;
        int bScore =0;
        int cScore =0;
        
        for (int i = 0; i< answers.length; i++){
            if(answers[i] == a[i%a.length]) aScore++;
            if(answers[i] == b[i%b.length]) bScore++;
            if(answers[i] == c[i%c.length]) cScore++;
        }
        
       int max = Math.max(aScore, Math.max(bScore, cScore));

        if (aScore == max) answer.add(1);
        if (bScore == max) answer.add(2);
        if (cScore == max) answer.add(3);
     
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
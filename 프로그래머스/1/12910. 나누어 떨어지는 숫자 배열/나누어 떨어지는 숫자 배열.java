import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] a = new int[arr.length];
        
        int cnt=0;
        for (int i= 0; i < arr.length; i++){
            if ((arr[i]%divisor)==0){
                a[cnt++]=arr[i];
            }
        }
        if(cnt==0){
                return new int[]{-1};
            }
        int[] answer=Arrays.copyOf(a,cnt);
        Arrays.sort(answer);
        return answer;
    }
}
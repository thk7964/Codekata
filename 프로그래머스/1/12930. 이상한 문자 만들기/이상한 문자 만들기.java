class Solution {
    public String solution(String s) {
        String answer = "";
        char[] a = s.toCharArray();
        int x=0;
        for(int i=0; i<s.length();i++){
            if(a[i]==' '){
                x = 0;
                answer += a[i];
                continue;
            }
            if(x%2==0){
                answer += Character.toUpperCase(a[i]);    
            }else{
                answer += Character.toLowerCase(a[i]);
            }
            x++;
        }
        
        return answer;
    }
}
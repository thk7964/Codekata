class Solution {
    public int[] solution(int[] arr) {
        int[] answer ;
        int min=arr[0];
        if(arr.length == 1){
           return new int[]{-1} ;  
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
              min=arr[i];
            }
        }
        answer= new int [arr.length-1];
        int x=0;
        for (int y: arr){
            if(y!=min){
                answer[x++]=y;   
            }
        }
        
        return answer;
    }
}
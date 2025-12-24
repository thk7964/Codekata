class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count=0;
        int zerocnt=0;
        for (int i=0; i<lottos.length; i++){
            if (lottos[i] !=0 ){
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i]==win_nums[j]){
                        count++;
                    }
                }
            }else{
                zerocnt++;
            }
        }
        answer[0]=win(count+zerocnt);
        answer[1]=win(count);       
        return answer;
    }
    int win(int num){
        int x=0;
        switch(num){
                case 0:
                case 1: x=6; break;
                case 2: x=5; break;
                case 3: x=4; break;
                case 4: x=3; break;
                case 5: x=2; break;
                case 6: x=1; break;
        }
    return x;
}

}


class Solution {
    public int solution(int n) {
        int answer = n-1;
        if(n%2!=0) return 2;
        else{
            for(int i=2; i<(n-1)/2; i++){
                if(n%i==1){
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}
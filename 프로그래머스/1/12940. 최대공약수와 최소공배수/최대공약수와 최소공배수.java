class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int lcm = 0;
        int gcf = 0;
        int min = (n > m)? m:n;
        int max = (n > m)? n:m;
        
        // lcm
        for(int i=1; i<=min; i++){
            if(min % i == 0 && max % i == 0){
                answer[0] = i;
            }
        }
        // gcf
        for(int i=1; i<=min; i++){
            if((max * i) % min == 0){
                answer[1] = max * i;
                break;
            }
        }
        return answer;
    }
}
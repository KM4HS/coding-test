class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        String repeat = "수박";
        if(n%2==0){
            for(int i=0; i<n/2; i++){
                sb.append(repeat);
            }
        }else{
            for(int i=0; i<(n-1)/2; i++){
                sb.append(repeat);
            }
            sb.append("수");
        }
        return sb.toString();
    }
}
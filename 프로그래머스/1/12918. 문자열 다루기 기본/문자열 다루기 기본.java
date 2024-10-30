class Solution {
    public boolean solution(String s) {
        String[] ss = s.split("");
        boolean answer = true;
        if(s.length()==4||s.length()==6){
            for(String c : ss){
                if(c.charAt(0)<48||c.charAt(0)>57){
                    answer = false;
                    break;
                }
            }
        }else answer = false;
        
        return answer;
    }
}
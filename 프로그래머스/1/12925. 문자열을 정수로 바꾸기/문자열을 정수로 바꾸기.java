class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean negative = false;
        
        if(s.charAt(0) == '-'){
            negative = true;
        }
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '+'||ch == '-'){
                continue;
            }
            answer = answer*10 + (ch - '0');
        }
        return (negative)? -answer:answer;
    }
}
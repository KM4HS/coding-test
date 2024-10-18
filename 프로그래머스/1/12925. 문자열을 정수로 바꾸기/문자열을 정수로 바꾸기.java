class Solution {
    public int solution(String s) {
        String numSign = s.substring(0,1);
        if(numSign.equals("+")){
            return Integer.parseInt(s.substring(1));
        }else if(numSign.equals("-")){
            return -Integer.parseInt(s.substring(1));
        }
        else {
            return Integer.parseInt(s);
        }
    }
}
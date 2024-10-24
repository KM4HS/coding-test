class Solution {
    public String solution(String s) {
        char[] chArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        if(s.length()%2 == 0){
            sb.append(chArr[s.length()/2-1]);
            sb.append(chArr[s.length()/2]);
        }else{
            sb.append(chArr[s.length()/2]);
        }
        return sb.toString();
    }
}
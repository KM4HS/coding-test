class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                if(c + n > 'z') {
                    c =  (char)(c + n - 'z' + 'a' - 1);
                } else {
                    c = (char)(c + n);
                }
            } else if (c >= 'A' && c <= 'Z') {
                if(c + n > 'Z') {
                    c = (char)(c + n - 'Z' + 'A' - 1);
                } else {
                    c = (char)(c + n);
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
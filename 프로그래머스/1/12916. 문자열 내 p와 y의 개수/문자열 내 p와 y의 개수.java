class Solution {
    boolean solution(String s) {
        int countY = 0;
        int countP = 0;
        
        s = s.toLowerCase();
        
        for(char c : s.toCharArray()) {
            if(c == 'y') {
                countY++;
            } else if (c == 'p') {
                countP++;
            }
        }

        return (countY == countP);
    }
}
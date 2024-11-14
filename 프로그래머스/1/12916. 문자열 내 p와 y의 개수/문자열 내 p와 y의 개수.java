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
        
        boolean answer = (countY == countP)? true : false;
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i=0; i<strings.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strings[i].charAt(n)).append(strings[i]);
            strings[i] = sb.toString();
        }
        Arrays.sort(strings);
        String[] answer = new String[strings.length];
        for(int i=0; i<strings.length; i++) {
            answer[i] = strings[i].substring(1);
        }
        return answer;
    }
}
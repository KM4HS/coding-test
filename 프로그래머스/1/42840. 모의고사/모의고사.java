import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int[] supo1 = new int[]{1,2,3,4,5};
        int[] supo2 = new int[]{2,1,2,3,2,4,2,5};
        int[] supo3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        int[] score = new int[]{0,0,0};
        
        int index = 0;
        
        while(index < answers.length) {
            if(supo1[index%5] == answers[index]) {
                score[0]++;
            }
            if(supo2[index%8] == answers[index]) {
                score[1]++;
            }
            if(supo3[index%10] == answers[index]) {
                score[2]++;
            }
            index++;
        }
        
        int max = Arrays.stream(score).max().getAsInt();
        for(int i=0; i<3; i++) {
            if(score[i] == max) {
                answer.add(i + 1);
            }
        }

        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
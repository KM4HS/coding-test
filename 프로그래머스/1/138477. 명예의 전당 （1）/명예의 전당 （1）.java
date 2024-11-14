import java.util.Queue;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Queue<Integer> record = new PriorityQueue<>();

        for(int j=0; j<score.length; j++) {
            if(j < k) {
                record.add(score[j]);
            } else if(score[j] > record.peek()) {
                record.add(score[j]);
                record.poll();
            }
            answer[j] = record.peek();
        }

        return answer;
    }
}
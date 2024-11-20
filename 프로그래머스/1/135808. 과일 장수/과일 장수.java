import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        Integer[] scores = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scores, Collections.reverseOrder());
        int index = m;
        int price = 0;

        while(score.length >= index) {
            price += scores[index - 1] * m;
            index += m;
        }

        return price;
    }
}
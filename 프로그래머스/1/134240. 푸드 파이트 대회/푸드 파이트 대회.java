class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        int foodType = 0;
        for(int i=1; i<food.length; i++) {
            foodType++;
            for(int j=0; j<food[i]/2; j++) {
                sb.append(foodType);
            }
        }
        String answer = sb.toString() + "0" + sb.reverse();
        return answer;
    }
}
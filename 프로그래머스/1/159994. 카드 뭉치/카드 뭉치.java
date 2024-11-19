class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int indexOne = 0;
        int indexTwo = 0;
        String answer = "Yes";
        
        for(String s : goal) {
            if(indexOne < cards1.length && s.equals(cards1[indexOne])) {
                indexOne++;
            } else if (indexTwo < cards2.length && s.equals(cards2[indexTwo])) {
                indexTwo++;
            } else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}
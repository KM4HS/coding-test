class Solution {
    public int[] solution(long n) {
        String temp = Long.toString(n);
        int[] answer = new int[temp.length()];
        int index = temp.length()-1;
        for(Character c : temp.toCharArray()){
            answer[index--] = Integer.parseInt(c.toString());
        }
        return answer;
    }
}
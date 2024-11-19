class Solution {
    public long solution(int price, int money, int count) {
        long answer = (long)count * price * (count + 1) / 2;
        answer -= money;
        
        return (answer > 0)? answer : 0;
    }
}
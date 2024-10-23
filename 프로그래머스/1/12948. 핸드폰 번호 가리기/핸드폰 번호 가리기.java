class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String lastFourNum = phone_number.substring(length-4, length);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<length-4; i++){
            sb.append("*");
        }
        return sb.append(lastFourNum).toString();
    }
}
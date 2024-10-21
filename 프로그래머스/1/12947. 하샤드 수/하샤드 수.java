class Solution {
    public boolean solution(int x) {
        String[] ss = String.valueOf(x).split("");
        int sum = 0;
        for(String s : ss){
            sum += Integer.parseInt(s);
        }
        
        return (x%sum==0);
    }
}
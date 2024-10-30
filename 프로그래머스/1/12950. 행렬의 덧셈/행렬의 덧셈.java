class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        int index = 0;
        for(int[] arr1Temp : arr1){
            for(int i=0; i<arr1Temp.length; i++){
                answer[index][i] =  arr1Temp[i] + arr2[index][i];
            }
            index++;
        }
        return answer;
    }
}
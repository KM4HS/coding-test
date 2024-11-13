class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int min = arr[0];
        
        if(arr.length == 1) {
            answer = new int[]{-1};
            return answer;
        } else {
            answer = new int[arr.length - 1];
        }

        for(int i=0; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        
        int index = 0;
        
        for(int n : arr) {
            if(n == min) {
                continue;
            }
            answer[index++] = n;
        }

        return answer;
    }
}
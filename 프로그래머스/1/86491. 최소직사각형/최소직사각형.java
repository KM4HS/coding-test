class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        for(int[] arr : sizes){
            maxWidth = Math.max(arr[0], maxWidth);
            maxHeight = Math.max(arr[1], maxHeight);
        }
        
        return maxWidth*maxHeight;
    }
}
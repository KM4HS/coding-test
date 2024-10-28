import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int left, int right) {
        List<Integer> oddArr = new ArrayList<>();
        List<Integer> evenArr = new ArrayList<>();
        for(int i=left; i<=right; i++){
            int count = 1;
            for(int j=1; j<=i/2; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count%2==0){
                evenArr.add(i);
            } else {
                oddArr.add(i);
            }
        }
        return evenArr.stream().mapToInt(Integer::intValue).sum() - oddArr.stream().mapToInt(Integer::intValue).sum();
    }
}
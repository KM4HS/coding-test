import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public long solution(long n) {
        List<Long> arr = new ArrayList<>();
        while(n>0){
            arr.add(n%10);
            n/=10;
        }
        arr.sort(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(long l : arr){
            sb.append(l);
        }

        return Long.parseLong(sb.toString());
    }
}
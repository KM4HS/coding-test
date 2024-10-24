import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<10; i++){
            set.add(i);
        }
        for(int n : numbers){
            set.remove(n);
        }
        return set.stream().mapToInt(Integer::intValue).sum();
    }
}
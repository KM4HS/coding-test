import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Map<Integer, Integer> month = new HashMap<>(){{
            put(1,31);
            put(2,29);
            put(3,31);
            put(4,30);
            put(5,31);
            put(6,30);
            put(7,31);
            put(8,31);
            put(9,30);
            put(10,31);
            put(11,30);
            put(12,31);
        }};

        int count = 5;
        for(int i = 1; i<a; i++) {
            count += month.get(i);
        }

        count += b - 1;
        return days[count%7];
    }
}
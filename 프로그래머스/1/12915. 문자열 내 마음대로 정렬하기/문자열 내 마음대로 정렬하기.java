import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strings, int n) {
        Map<Character, List<String>> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(String s : strings) {
            if(map.get(s.charAt(n)) == null) {
                map.put(s.charAt(n), new ArrayList<>());
            }
            map.get(s.charAt(n)).add(s);
        }
        map.keySet().stream()
                .sorted()
                .forEach(a -> {
                    map.get(a).stream().sorted()
                            .forEach(result::add);
                });

        return result.toArray(String[]::new);
    }
}
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        Integer[] arr = new Integer[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = (int)s.charAt(i);
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append((char)i);
        }
        return sb.toString();
    }
}
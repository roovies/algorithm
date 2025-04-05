import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String[] arr = my_string.split("");
        
        while(s < e) {
            String tmp = arr[s];
            arr[s] = arr[e];
            arr[e] = tmp;          
            s++;
            e--;
        }
        
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        
        
        return sb.toString();
    }
}
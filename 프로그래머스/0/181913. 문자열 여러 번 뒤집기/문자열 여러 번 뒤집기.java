import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        String[] splited = my_string.split("");
        
        ArrayDeque<String> dq = new ArrayDeque<>();
        
        for (int[] arr : queries) {
            for (int i = arr[0]; i <= arr[1]; i++) {
                dq.push(splited[i]);
            }
            
            for (int i = arr[0]; i <= arr[1]; i++) {
                splited[i] = dq.pop();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (String str : splited) {
            sb.append(str);
        }
        
        
        
        
        return sb.toString();
    }
}
import java.util.*;

class Solution {
    public int[] solution(long n) {

        
        String[] arr = String.valueOf(n).split("");
        int[] answer = new int[arr.length];
        
        int k = 0;
        for(int i = arr.length-1; i >= 0; i--) {
            answer[k] = Integer.parseInt(arr[i]);
            k++;
        }
        
        return answer;
        
    }
}
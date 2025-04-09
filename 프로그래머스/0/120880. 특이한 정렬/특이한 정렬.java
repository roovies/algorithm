import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        int[] answer = new int[len];
        Integer[] arr = new Integer[len];
        for (int i = 0; i < len; i++) {
            arr[i] = numlist[i];
        }
        
        Arrays.sort(arr, (n1, n2) -> {
            if (Math.abs(n-n1) == Math.abs(n-n2))
                return n2 - n1;
            return (Math.abs(n-n1) - Math.abs(n-n2));
        });
        
        for (int i = 0; i < len; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}
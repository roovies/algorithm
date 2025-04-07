import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int idx = commands[i][2];
            
            int[] tmpArray = new int[end-start+1];
            
            int k = 0;
            for (int j = start-1; j < end; j++) {
                tmpArray[k] = array[j];
                k++;
            }
            
            Arrays.sort(tmpArray);
            answer[i] = tmpArray[idx-1];
        }
        
        return answer;
    }
}
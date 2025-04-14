import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // arr은 숫자 0~9로 이루어짐
        // 연속적으로 나타나는 숫자는 하나만 남기고 나머진 제거
        // 제거된 후 남은 수를 반환할 때에는 기존 순서를 유지해야 함
        
        Deque<Integer> dq = new ArrayDeque<>();
        int currentNum = -1;
        
        for (Integer num : arr) {
            if (currentNum == num) {
                continue;
            }
            currentNum = num;
            dq.offerLast(num);
        }
        
        int[] answer = new int[dq.size()];
        
        int idx = 0;
        while(!dq.isEmpty()) {
            answer[idx] = dq.pollFirst();
            idx++;
        }
        
        return answer;
    }
}
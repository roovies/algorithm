import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        Map<Integer, List<Integer>> map = new TreeMap<>(); 
        
        for (int num : numlist) {
            int diff = (n-num > 0) ? n-num : -(n-num);
            
            if(diff == 0)
                answer[0] = num;
            else {
                List<Integer> list = map.get(diff);
                if(list == null) {
                    list = new ArrayList<>();
                    list.add(num);
                    map.put(diff, list);
                } else
                    list.add(num);
            }
        }
        
        int i = answer[0] != 0 ? 1 : 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            
            Collections.sort(list, Collections.reverseOrder());
            
            for (int num : list) {
                answer[i] = num;
                i++;
            }
        }
        
        return answer;
    }
}
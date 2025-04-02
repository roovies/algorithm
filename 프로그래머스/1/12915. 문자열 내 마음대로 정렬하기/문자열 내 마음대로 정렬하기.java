import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Map<Integer, PriorityQueue<String>> map = new HashMap<>();
        
        for (String str : strings) {
            int idx = (int) str.charAt(n);
            PriorityQueue<String> pq = map.get(idx);
            if (pq == null) {
                pq = new PriorityQueue<>();
                pq.add(str);
                map.put(idx, pq);
            } else {
                pq.add(str);
            }
        }
        
        Set<Integer> keys = map.keySet();
        List<Integer> keyList = new ArrayList<>(keys);
        Collections.sort(keyList);
        
        List<String> strList = new ArrayList<>();
        
        for (Integer idx : keyList) {
            PriorityQueue<String> pq = map.get(idx);
            while(!pq.isEmpty()) {
                strList.add(pq.poll());
            }
        }
        
        return strList.toArray(new String[0]);
    }
}
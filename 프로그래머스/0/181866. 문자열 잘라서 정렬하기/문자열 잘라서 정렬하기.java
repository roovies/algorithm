import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        String[] arr = myString.split("x");
        for (String str : arr) {
            if(str.equals(""))
                continue;
            list.add(str);
        }
        // x가 포함된 문자열이 주어짐
        // x를 구분자로 잘라내 배열을 만들고, 사전순으로 정렬한 배열을 return
        // 빈 문자열을 반환할 배열에 넣지 않음
        // 문자열의 길이는 최대 10만
        
        Collections.sort(list);
        
        String[] answer = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
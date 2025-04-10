import java.util.*;

class Solution {
    public long solution(long n) {
        // n의 입력값 자릿수는 최대 80억
        String[] strArray = String.valueOf(n).split("");
        
        Integer[] intArray = new Integer[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        
        Arrays.sort(intArray, Comparator.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(int num : intArray) {
            sb.append(num);
        }
        
        return Long.parseLong(sb.toString());
    }
}
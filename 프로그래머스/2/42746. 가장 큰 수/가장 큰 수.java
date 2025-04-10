import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // 1. 숫자를 이어 붙여서 큰 수를 만들기 위해서는 앞자리가 커야 한다.
        // 2. 앞자리만 추출하기에는 2자리, 3자리 수의 경우 판단할 수 없다 -> 30, 35 일 때 35가 앞에 외야함
        // 3. 각 원소는 1,000 이하이므로 평균적으로 3자리 수까지 판단해야 할 수 있다.
        // 4. 배열의 길이는 100,000 이하이므로 하나의 숫자를 분해해서 각 자리를 판단하는 것은 비효율적이다.
        // 5. 이때 선행 숫자와 후행 숫자를 이어 붙여서 더 큰 숫자를 판단하여 정렬하면 해결할 수 있다고 한다.
        int len = numbers.length;
        String[] arr = new String[len];
        for (int i = 0; i < len; i++ ) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, (i, j) -> {
            String val1 = i + j;
            String val2 = j + i;
            
            return val2.compareTo(val1);
        });
        
        StringBuilder sb = new StringBuilder();
        if (arr[0].equals("0")) // ㅇ
            return "0";
        
        for(String s : arr) {
            sb.append(s);
        }
        
        String result = sb.toString();
        
        return sb.toString();
    }
}
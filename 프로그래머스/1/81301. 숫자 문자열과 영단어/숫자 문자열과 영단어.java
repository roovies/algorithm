class Solution {
    public int solution(String s) {
        String[] engs = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < engs.length; i++) {
            s = s.replace(engs[i], String.valueOf(i));
        }
        
        
        return Integer.parseInt(s);
    }
}
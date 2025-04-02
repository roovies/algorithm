import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        Set<String> set = new HashSet<>(Arrays.asList("i", "pa", "te", "ni", "niti",
                                                      "a", "ali", "nego", "no", "ili"));
        
        StringBuilder sb = new StringBuilder();
        
        String[] splited = input.split(" ");
        boolean isFirst = true;
        for (String str : splited) {
            if(isFirst) {
                char c = (char) (str.charAt(0) - 32);
                sb.append(c);
                isFirst = false;
            } else {
                if(!set.contains(str)) {
                    char c = (char) (str.charAt(0) - 32);
                    sb.append(c);
                }
            }
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write(sb.toString());
        bw.close();
        
        
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        String[] splited = input.split("");
        
        int start = 0;
        int end = splited.length - 1;
        
        boolean result = true;
        
        while(start < end) {
            String s1 = splited[start];
            String s2 = splited[end];
            
            if(!s1.equals(s2))
                result = false;
            
            start++;
            end--;
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.close();
        br.close();
    }
}
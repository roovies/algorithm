import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        char[] arr = str.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 96) {
                arr[i] -= 32;
            } else {
                arr[i] += 32;
            }
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write(new String(arr));
        bw.close();
        br.close();
    }
}
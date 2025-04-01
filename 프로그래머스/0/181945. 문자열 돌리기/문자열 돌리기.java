import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        
        String[] arr = a.split("");
        
        for (String str : arr) {
            System.out.println(str);
        }
        
        br.close();
    }
}
import java.util.*;
import java.io.*;
    
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int total = Integer.parseInt(input[0]);
        int order = Integer.parseInt(input[1]);

        List<String> list = new ArrayList<>();
        int count = 0;
        while(count < total) {
            list.add(br.readLine());
            count++;
        }

        Collections.sort(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(list.get(order - 1));

        br.close();
        bw.close();
    }
}

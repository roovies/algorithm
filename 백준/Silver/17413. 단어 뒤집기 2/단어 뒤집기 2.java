import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 문자열은 소문자, 숫자, 공백, <, > 로만 이루어져있음
        // 문자열의 시작과 끝은 공백이 아님
        // <가 등장하면 >가 무조건 등장함
        // -> 이러한 태그 문자는 길이가 3이상인 부분 문자열이고,
        // <> 사이에는 소문자와 공백만 있음
        // 연속하는 두 단어는 공백 하나로 취급함 => 단어는 공백으로 구분
        // 태그는 단어가 아님, 태그 사이에는 공백이 없음

        // 단어가 아닌 문자열은 그대로 출력하고, 단어만 뒤집어야 한다.
        // 단어: 알파벳 소문자 + 숫자로 이루어진 문자열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = Main.solution(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }

    public static String solution(String str) {

        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        boolean tag = false;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            // 만약 현재 문자가 태그의 시작(<)일 경우  tag 플래그 변경 후 기존 스택에 있는 문자들을 모두 꺼낸 후 < 문자 저장
            if (c == '<') {
                tag = true;
                while (!stack.isEmpty())
                    sb.append(stack.pollLast());
                sb.append(c);
            } else if (c == '>') { // 만약 현재 문자가 태그의 종료(>)일 경우 태그 플래그를 false로 변경한 후 적재
                tag = false;
                sb.append(c);
            } else if (tag) { // 현재 태그 내에 들어가는 문자일 경우 그냥 문자열에 적재
                sb.append(c);
            } else { // 태그가 아닐 경우
                if (c == ' ') { // 태그가 아니고, 공백일 경우 단어이므로 역순으로 담아야 함
                    while (!stack.isEmpty())
                        sb.append(stack.pollLast());
                    sb.append(c);
                } else {
                    stack.offerLast(c);
                }
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pollLast());
        }
        return sb.toString();
    }
}
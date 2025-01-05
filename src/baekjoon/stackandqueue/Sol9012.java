package baekjoon.stackandqueue;

import java.util.*;
import java.io.*;
public class Sol9012 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; ++i) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            boolean flag = true;
            for (char c : input.toCharArray()) {
                if (c == '(') {
                    stack.push('(');
                } else {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty() && flag) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();

    }
}

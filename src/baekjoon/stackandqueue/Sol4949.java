package baekjoon.stackandqueue;

import java.io.*;
import java.util.Stack;

public class Sol4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String sentence = br.readLine();
            if (sentence.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            for (char c : sentence.toCharArray()) {
                if (c == '(') {
                    stack.push('(');
                } else if (c == '[') {
                    stack.push('[');
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        if (stack.pop() != '(') {
                            flag = false;
                            break;
                        }
                    }
                } else if (c == ']') {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        if (stack.pop() != '[') {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if (stack.isEmpty() && flag) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.flush();
        bw.close();
    }
}

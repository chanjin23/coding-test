package baekjoon.stackandqueue;

import java.util.*;
import java.io.*;

public class Sol12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int snackSeq = 1;
        for (int i = 0; i < n; ++i) {
            int num = Integer.parseInt(st.nextToken());
            if (num == snackSeq) {
                snackSeq++;
                while (!stack.isEmpty() && snackSeq==stack.peek()) {
                    stack.pop();
                    snackSeq++;
                }
            } else {
                stack.push(num);
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}

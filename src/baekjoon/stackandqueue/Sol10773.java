package baekjoon.stackandqueue;

import java.util.*;
import java.io.*;
public class Sol10773 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; ++i) {
            int x = Integer.parseInt(br.readLine());
            if (x != 0) {
                stack.push(x);
            } else {
                stack.pop();
            }
        }
        int cnt = 0;
        while (!stack.isEmpty()) {
            cnt += stack.pop();
        }
        System.out.println(cnt);
    }
}

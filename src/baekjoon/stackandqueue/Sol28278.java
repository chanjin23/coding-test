package baekjoon.stackandqueue;

import java.util.*;
import java.io.*;
public class Sol28278 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            if (x == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (x == 2) {
                if (stack.isEmpty()) {
                    bw.write(-1+"\n");
                } else {
                    bw.write(stack.pop()+"\n");
                }
            } else if (x == 3) {
                bw.write(stack.size() + "\n");
            } else if (x == 4) {
                if(stack.isEmpty()) bw.write(1 + "\n");
                else bw.write(0 + "\n");
            } else if (x == 5) {
                if(stack.isEmpty()) bw.write(-1 + "\n");
                else bw.write(stack.peek() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}

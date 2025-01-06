package baekjoon.stackandqueue;
import java.util.*;
import java.io.*;

public class Sol28279 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            if (x == 1) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if (x == 2) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if (x == 3) {
                if(deque.isEmpty()) bw.write(-1 + "\n");
                else bw.write(deque.pollFirst() + "\n");
            } else if (x == 4) {
                if(deque.isEmpty()) bw.write(-1 + "\n");
                else bw.write(deque.pollLast() + "\n");
            } else if (x == 5) {
                bw.write(deque.size() + "\n");
            } else if (x == 6) {
                if(deque.isEmpty()) bw.write(1 + "\n");
                else bw.write(0 + "\n");
            } else if (x == 7) {
                if(deque.isEmpty()) bw.write(-1 + "\n");
                else bw.write(deque.peekFirst() + "\n");
            } else if (x == 8) {
                if(deque.isEmpty()) bw.write(-1 + "\n");
                else bw.write(deque.peekLast() + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}

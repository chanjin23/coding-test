package baekjoon.stackandqueue;

import java.util.*;
import java.io.*;
public class Sol18258 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                queue.add(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")) {
                if(queue.isEmpty()) bw.write(-1+"\n");
                else bw.write(queue.poll() + "\n");
            }else if (command.equals("size")) {
                bw.write(queue.size() + "\n");
            }else if (command.equals("empty")) {
                if(queue.isEmpty()) bw.write(1 + "\n");
                else bw.write(0 + "\n");
            }else if (command.equals("front")) {
                if(queue.isEmpty()) bw.write(-1 + "\n");
                else bw.write(queue.peek() + "\n");
            }else if (command.equals("back")) {
                if(queue.isEmpty()) bw.write(-1 + "\n");
                else bw.write(queue.peekLast() + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}

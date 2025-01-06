package baekjoon.stackandqueue;

import java.util.*;
import java.io.*;

public class Sol2346 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Point> d = new ArrayDeque<>();
        for (int i = 1; i <= n; ++i) {
            d.offer(new Point(i, Integer.parseInt(st.nextToken())));
        }

        Point p=d.poll();
        sb.append(p.x + " ");
        int move = p.y;
        while (true) {
            if(d.isEmpty()) break;
            if (move > 0) {
                for (int i = 0; i < move - 1; ++i) {
                    d.offer(d.poll());
                }
                p = d.pollFirst();
                sb.append(p.x + " ");
                move = p.y;
            } else {
                for (int i = move + 1; i < 0; ++i) {
                    d.offerFirst(d.pollLast());
                }
                p = d.pollLast();
                sb.append(p.x + " ");
                move = p.y;
            }
        }
        System.out.println(sb);
    }

    public static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.*;
import java.io.*;

public class Sol13913 {
    static int n, k;
    static int[] time, parent;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        time = new int[100001];
        parent = new int[100001];

        bfs();

        Stack<Integer> stack = new Stack<>();
        stack.push(k);
        int idx = k;
        while (idx != n) {
            stack.push(parent[idx]);
            idx = parent[idx];
        }

        System.out.println(time[k] - 1);
        while (!stack.isEmpty()) {
            sb.append(stack.pop() + " ");
        }
        System.out.println(sb);
    }

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(n);
        time[n] = 1;

        while (!q.isEmpty()) {
            int now = q.poll();

            if (now == k) return;

            for (int i = 0; i < 3; ++i) {
                int next;

                if (i == 0) next = now + 1;
                else if (i == 1) next = now - 1;
                else next = now * 2;

                if (next < 0 || next > 100000) continue;

                if (time[next] == 0) {
                    q.offer(next);
                    time[next] = time[now] + 1;
                    parent[next] = now;
                }
            }
        }
    }
}

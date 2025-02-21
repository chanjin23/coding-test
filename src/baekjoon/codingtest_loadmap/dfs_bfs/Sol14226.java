package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.*;

public class Sol14226 {
    static int s;
    static boolean[][] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s = sc.nextInt();
        check = new boolean[1001][1001];

        System.out.println(bfs());
    }

    public static int bfs() {
        Queue<Info> q = new LinkedList<>();
        q.offer(new Info(1, 0, 0));
        check[1][0] = true;

        while (!q.isEmpty()) {
            Info tmp = q.poll();
            if (tmp.total == s) return tmp.time;
            for (int i = 0; i < 3; ++i) {
                int nextTotal = tmp.total;
                int nextClipboard = tmp.clipboard;
                int nextTime = tmp.time;


                if (i == 0) {
                    nextClipboard = nextTotal;
                } else if (i == 1) {
                    nextTotal += nextClipboard;
                } else {
                    nextTotal--;
                }

                if (nextTotal < 1 || nextTotal > 1000) continue;
                if (check[nextTotal][nextClipboard]) continue;

                q.offer(new Info(nextTotal, nextClipboard, ++nextTime));
                check[nextTotal][nextClipboard] = true;
            }
        }
        return 0;
    }

    public static class Info {
        int total;
        int clipboard;
        int time;

        Info(int total, int clipboard, int time) {
            this.total = total;
            this.clipboard = clipboard;
            this.time = time;
        }
    }
}

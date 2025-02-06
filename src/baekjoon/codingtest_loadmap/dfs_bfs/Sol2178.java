package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.*;
import java.io.*;

public class Sol2178 {
    //미로 탐색
    static int n, m;
    static int[][] arr, answer;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        answer = new int[n][m];

        for (int i = 0; i < n; ++i) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < m; ++j) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        answer[0][0] = 1;
        arr[0][0] = 0;
        bfs(0, 0);

        System.out.println(answer[n - 1][m - 1]);
    }

    public static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            if (tmp.x == n - 1 && tmp.y == m - 1) break;
            for (int i = 0; i < 4; ++i) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1) {
                    arr[nx][ny] = 0;
                    answer[nx][ny] = answer[tmp.x][tmp.y] + 1;
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

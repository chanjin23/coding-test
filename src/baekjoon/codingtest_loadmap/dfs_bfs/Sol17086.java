package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.*;
import java.io.*;

public class Sol17086 {
    static int n, m, answer;
    static int[][] arr;
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        answer = Integer.MIN_VALUE;

        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (arr[i][j] == 0) {
                    int value = bfs(i, j);
                    answer = Math.max(value, answer);
                }
            }
        }

        System.out.println(answer);
    }

    public static int bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        q.offer(new Point(x, y));
        visited[x][y] = true;
        int cnt = 1;
        while (!q.isEmpty()) {
            int len=q.size();
            for (int i = 0; i < len; ++i) {
                Point tmp = q.poll();
                for (int j = 0; j < 8; ++j) {
                    int nx = tmp.x + dx[j];
                    int ny = tmp.y + dy[j];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
                        if (arr[nx][ny] == 1) return cnt;
                        visited[nx][ny] = true;
                        q.offer(new Point(nx, ny));
                    }
                }
            }
            cnt++;
        }
        return cnt;
    }

    public static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.*;
import java.io.*;

public class Sol16930 {
    static int n, m, k, x1, y1, x2, y2;
    static int[][] visited, arr;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; ++i) {
            String[] strs = br.readLine().split("");
            for (int j = 0; j < m; ++j) {
                if (strs[j].equals(".")) arr[i][j] = 0;
                else arr[i][j] = 1;
            }
        }

        st = new StringTokenizer(br.readLine());
        x1 = Integer.parseInt(st.nextToken());
        y1 = Integer.parseInt(st.nextToken());
        x2 = Integer.parseInt(st.nextToken());
        y2 = Integer.parseInt(st.nextToken());

        bfs(x1 - 1, y1 - 1);

        System.out.println(visited[x2 - 1][y2 - 1] != 0 ? visited[x2 - 1][y2 - 1] : -1);
    }

    public static void bfs(int x1, int y1) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x1, y1));

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; ++i) {
                Point tmp = q.poll();
                for (int j = 0; j < 4; ++j) {
                    for (int l = 1; l <= k; ++l) {
                        int nx = tmp.x + dx[j] * l;
                        int ny = tmp.y + dy[j] * l;

                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) break;
                        if (arr[nx][ny] == 1) break;

                        if (visited[nx][ny] == 0) {
                            q.offer(new Point(nx, ny));
                            visited[nx][ny] = visited[tmp.x][tmp.y] + 1;
                            if (nx == x2 - 1 && ny == y2 - 1) return;
                        } else if (visited[nx][ny] <= visited[tmp.x][tmp.y]) break;
                    }
                }
            }
        }
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

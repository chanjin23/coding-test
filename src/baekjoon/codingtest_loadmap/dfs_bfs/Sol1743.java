package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.*;
import java.io.*;

public class Sol1743 {
    //음식물 피하기
    static int n, m, k, answer;
    static int[][] arr;
    static List<Point> list;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        list = new ArrayList<>();
        answer = 0;

        for (int i = 0; i < k; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x - 1][y - 1] = 1;
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                    bfs(i, j);
                }
            }
        }

        System.out.println(answer);
    }

    public static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        int count = 1;
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; ++i) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1) {
                    q.offer(new Point(nx, ny));
                    arr[nx][ny] = 0;
                    count++;
                }
            }
        }
        answer = Math.max(count, answer);
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

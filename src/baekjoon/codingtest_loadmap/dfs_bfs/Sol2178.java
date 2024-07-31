package baekjoon.codingtest_loadmap.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol2178 {
    //미로 탐색
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int[][] answer = new int[n][m];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; ++i) {
            char[] ch = br.readLine().toCharArray();
            for (int j = 0; j < m; ++j) {
                arr[i][j] = ch[j]-'0';
            }
        }


        Queue<Point> q = new LinkedList<>();
        answer[0][0] = 1;
        arr[0][0] = 0;
        q.offer(new Point(0, 0));

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; ++i) {
                Point p = q.poll();
                for (int j = 0; j < 4; ++j) {
                    int nx = p.x + dx[j];
                    int ny = p.y + dy[j];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1) {
                        arr[nx][ny] = 0;
                        q.offer(new Point(nx, ny));
                        answer[nx][ny] = answer[p.x][p.y] + 1;
                    }
                }
            }
        }

        System.out.println(answer[n - 1][m - 1]);
    }

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

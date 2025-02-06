package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.*;
import java.io.*;

public class Sol1303 {
    //전투
    static int n, m, totalB, totalW;
    static char[][] arr;
    static int[][] check;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[m][n];
        check = new int[m][n];
        totalB = 0;
        totalW = 0;

        for (int i = 0; i < m; ++i) {
            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < input.length; ++j) {
                arr[i][j] = input[j];
            }
        }

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (check[i][j] == 0) {
                    check[i][j] = 1;
                    bfs(i, j, arr[i][j]);
                }
            }
        }

        System.out.println(totalW + " " + totalB);
    }

    public static void bfs(int x, int y, char army) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        int count = 1;
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; ++i) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && check[nx][ny] == 0 &&arr[nx][ny]==army) {
                    check[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    count++;
                }
            }
        }
        if (army == 'W') {
            totalW += (count * count);
        } else {
            totalB += (count * count);
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

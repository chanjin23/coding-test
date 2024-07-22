package inflearn.introduction.utilizingdfsbfs;

import java.util.*;
import java.io.*;
public class Sol0812Tomato {
    static int[][] arr,tomato;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {-0, 1, 0, -1};
    static int m,n,count;
    static Queue<Point> q;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        m = Integer.parseInt(st.nextToken());   //열
        n = Integer.parseInt(st.nextToken());   //행
        arr = new int[n][m];
        tomato = new int[n][m];
        q = new LinkedList<>();

        for (int i = 0; i < n; ++i) {
            st= new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < m; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    q.offer(new Point(i, j));
                }
            }
        }
        bfs();
        long max=0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (arr[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, tomato[i][j]);
            }
        }
        System.out.println(max);
    }

    public static void bfs() {
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; ++i) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx <= n - 1 && ny >= 0 && ny <= m - 1 && arr[nx][ny] == 0) {
                    arr[nx][ny]=1;
                    q.offer(new Point(nx, ny));
                    tomato[nx][ny]=tomato[tmp.x][tmp.y]+1;
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

package inflearn.introduction.utilizingdfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol0811ShortestDistanceMaze {
    static int[][] arr,dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[7][7];
        dis = new int[7][7];
        for (int i = 0; i < 7; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        arr[0][0] = 1;
        bfs(0, 0);
        if(dis[6][6]==0) System.out.println("-1");
        else System.out.println(dis[6][6]);
    }

    public static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; ++i) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx <= 6 && ny >= 0 && ny <= 6 && arr[nx][ny] == 0) {
                    arr[nx][ny]=1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
    public static class Point{
        int x;
        int y;
        Point(int x, int y) {
            this.x=x;
            this.y = y;
        }
    }
}

package baekjoon.codingtest_loadmap.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol1743 {
    //음식물 피하기
    static int n, m, count;
    static boolean[][] arr;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr = new boolean[n + 1][m + 1];

        for (int i = 0; i < k; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = true;
        }

//        for (int i = 1; i <= n; ++i) {
//            for (int j = 1; j <= m; ++j) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        int max = 0;

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                if (arr[i][j]) {
                    count = 1;
                    arr[i][j] = false;

                    dfs(i, j);

                    max = Math.max(count, max);
                    count = 0;
                }
            }
        }
        System.out.println(max);
    }

    private static void dfs(int x, int y) {
        for (int i = 0; i < 4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 1 && nx <= n && ny >= 1 && ny <= m && arr[nx][ny]) {
                count++;
                arr[nx][ny] = false;
                dfs(nx, ny);
            }
        }
    }
}

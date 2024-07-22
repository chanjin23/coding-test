package inflearn.introduction.utilizingdfsbfs;

import java.util.*;
import java.io.*;
public class Sol0813IslandDFS {
    static int n;
    static int[][] arr;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer=0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (arr[i][j] == 1) {
                    arr[i][j]=0;
                    dfs(i,j);
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    public static void dfs(int x, int y) {
        for (int i = 0; i < 8; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx <= n - 1 && ny >= 0 && ny <= n - 1 && arr[nx][ny] == 1) {
                arr[nx][ny] = 0;
                dfs(nx, ny);
            }
        }

    }
}

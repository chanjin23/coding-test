package baekjoon.codingtest_loadmap.basicalgorithm;

import java.util.*;
import java.io.*;

public class Sol17070 {
    static int n, answer;
    static int[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        answer = 0;

        for (int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        arr[0][0] = 1;
        arr[0][1] = 1;
        dfs(0, 0, 1);

        System.out.println(answer);
    }

    public static void dfs(int position, int x, int y) {
        if (x == n - 1 && y == n - 1) {
            answer++;
        } else {
            if (position == 0) {
                row(x, y);
                diagnol(x, y);
            } else if (position == 1) {
                column(x, y);
                diagnol(x, y);
            } else if (position == 2) {
                column(x, y);
                row(x, y);
                diagnol(x, y);
            }
        }
    }

    public static void row(int x, int y) {
        int nx = x;
        int ny = y + 1;
        if (nx >= 0 && ny >= 0 && nx < n && ny < n && arr[nx][ny] == 0) {
            arr[nx][ny] = 1;
            dfs(0, nx, ny);
            arr[nx][ny] = 0;
        }
    }

    public static void column(int x, int y) {
        int nx = x + 1;
        int ny = y;
        if (nx >= 0 && ny >= 0 && nx < n && ny < n && arr[nx][ny] == 0) {
            arr[nx][ny] = 1;
            dfs(1, nx, ny);
            arr[nx][ny] = 0;
        }
    }

    public static void diagnol(int x, int y) {
        int nx = x + 1;
        int ny = y + 1;
        if (nx >= 0 && ny >= 0 && nx < n && ny < n
                && arr[nx][ny] == 0 && arr[nx - 1][ny] == 0 && arr[nx][ny - 1] == 0) {
            arr[nx][ny] = 1;
            arr[nx - 1][ny] = 1;
            arr[nx][ny - 1] = 1;
            dfs(2, nx, ny);
            arr[nx][ny] = 0;
            arr[nx - 1][ny] = 0;
            arr[nx][ny - 1] = 0;
        }
    }
}

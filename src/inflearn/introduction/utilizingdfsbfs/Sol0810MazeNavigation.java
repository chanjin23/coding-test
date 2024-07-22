package inflearn.introduction.utilizingdfsbfs;

import java.util.*;
import java.io.*;
public class Sol0810MazeNavigation {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr;
    static int answer=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[7][7];
        for (int i = 0; i < 7; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        arr[0][0]=1;
        dfs(0,0);
        System.out.println(answer);
    }

    public static void dfs(int a, int b) {
        if (a == 6 && b == 6) {
            answer++;
        }else{
            for (int i = 0; i < 4; ++i) {
                int nx = a + dx[i];
                int ny = b + dy[i];
                if (nx >= 0 && nx <= 6 && ny >= 0 && ny <= 6 && arr[nx][ny] == 0) {
                    arr[nx][ny]=1;
                    dfs(nx, ny);
                    arr[nx][ny]=0;
                }
            }
        }
    }
}

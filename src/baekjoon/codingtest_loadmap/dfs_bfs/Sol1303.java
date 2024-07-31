package baekjoon.codingtest_loadmap.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol1303 {
    //전투
    static int n,m, count = 0;
    static char[][] arr;
    static boolean[][] check;
    static int[] dx,dy;
    public static void main(String[] args) throws IOException {
        int enemyTotal=0;
        int ourTotal=0;
        dx = new int[]{-1, 0, 1, 0};
        dy = new int[]{0, 1, 0, -1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());   //가로
        m = Integer.parseInt(st.nextToken());   //세로

        arr = new char[m][n];
        check = new boolean[m][n];

        for (int i = 0; i < m; ++i) {
            char[] ch = br.readLine().toCharArray();
            for (int j = 0; j < n; ++j) {
                arr[i][j] = ch[j];
            }
        }

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                count=0;
                if (arr[i][j] == 'W' && !check[i][j]) {
                    check[i][j]=true;
                    count++;
                    dfs(i, j, 'W');
                    ourTotal+=(count*count);
                }
                if(arr[i][j] == 'B' && !check[i][j]){
                    check[i][j]=true;
                    count++;
                    dfs(i, j, 'B');
                    enemyTotal += (count * count);
                }
            }
        }
        System.out.println(ourTotal+" "+enemyTotal);

    }

    public static void dfs(int x, int y, char color) {
        for (int i = 0; i < 4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < m && ny >= 0 && ny < n && arr[nx][ny] == color && !check[nx][ny]) {
                check[nx][ny]=true;
                count++;
                dfs(nx, ny, color);
            }
        }
    }
}

package baekjoon.codingtest_loadmap.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol2606 {
    //바이러스
    static int node,count;
    static boolean[] check;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());

        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1];

        for (int i = 0; i < line; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            arr[first][last] = arr[last][first] = 1;
        }

        check[1] = true;
        count=0;
        dfs(1);

        System.out.println(count);
    }

    private static void dfs(int nodeNumber) {
        for (int i = 1; i <= node; ++i) {
            if (arr[nodeNumber][i] == 1 && !check[i]) {
                check[i] = true;
                count++;
                dfs(i);
            }
        }
    }
}

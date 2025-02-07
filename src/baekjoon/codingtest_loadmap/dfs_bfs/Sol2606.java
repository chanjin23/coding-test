package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.*;
import java.io.*;

public class Sol2606 {
    //바이러스
    static int n, m, answer;
    static List<List<Integer>> list;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        arr = new int[n + 1];
        answer = 0;

        for (int i = 0; i <= n; ++i) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            list.get(node1).add(node2);
            list.get(node2).add(node1);
        }

        arr[1] = 1;
        dfs(1);

        System.out.println(answer);
    }

    public static void dfs(int node) {
        for (int i : list.get(node)) {
            if (arr[i] == 0) {
                arr[i] = 1;
                answer++;
                dfs(i);
            }
        }
    }
}

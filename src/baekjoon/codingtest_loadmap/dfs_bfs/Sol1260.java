package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.*;
import java.io.*;

public class Sol1260 {
    //DFS와 BFS
    static int n, m, v;
    static List<List<Integer>> list;
    static int[] arr;
    static List<Integer> dfsList, bfsList;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();
        dfsList = new ArrayList<>();
        bfsList = new ArrayList<>();
        arr = new int[n + 1];

        for (int i = 0; i <= n; ++i) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; ++i) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            list.get(node1).add(node2);
            list.get(node2).add(node1);
        }

        for (int i = 1; i <= n; ++i) Collections.sort(list.get(i));

        arr[v] = 1;
        dfsList.add(v);
        dfs(v);

        Arrays.fill(arr, 0);
        bfs(v);

        for (int i = 0; i < dfsList.size(); ++i) {
            System.out.print(dfsList.get(i)+" ");
        }
        System.out.println();

        for (int i = 0; i < bfsList.size(); ++i) {
            System.out.print(bfsList.get(i)+" ");
        }
    }

    public static void dfs(int node) {
        for (int i : list.get(node)) {
            if (arr[i] == 0) {
                arr[i] = 1;
                dfsList.add(i);
                dfs(i);
            }
        }
    }

    public static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        arr[node] = 1;
        bfsList.add(node);
        while (!q.isEmpty()) {
            int tmp = q.poll();
            for (int i : list.get(tmp)) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                    bfsList.add(i);
                    q.offer(i);
                }
            }
        }
    }
}

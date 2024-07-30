package baekjoon.codingtest_loadmap.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sol1260 {
    //DFS와 BFS
    static int n, m, v;
    static Point[] arr,arr2;
    static boolean check[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        arr = new Point[n + 1];
        arr2 = new Point[n + 1];
        check = new boolean[n + 1];
        for (int i = 1; i < n + 1; ++i) {
            arr[i] = new Point(new PriorityQueue<>());
            arr2[i] = new Point(new PriorityQueue<>());
        }

        for (int i = 0; i < m; ++i) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            arr[first].list.add(second);
            arr2[first].list.add(second);
            arr[second].list.add(first);
            arr2[second].list.add(first);
        }

//        System.out.println(arr[1].list.poll());
//        System.out.println(arr[1].list.poll());

//        for (int i = 1; i < n + 1; ++i) {
//            PriorityQueue<Integer> queue = arr[i].list;
//            int size = queue.size();
//            for (int j = 0; j < size; ++j) {
//                System.out.print(queue.poll()+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("----------------------");

        check[v] = true;
        dfs(v);
        System.out.println();

        Queue<Integer> q = new LinkedList<>();
        boolean[] bfsCheck = new boolean[n + 1];

        q.add(v);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; ++i) {
                Integer tmp = q.poll();
                if(!bfsCheck[tmp]) System.out.print(tmp + " ");
                bfsCheck[tmp] = true;

                int len = arr2[tmp].list.size();
                for (int j = 0; j < len; ++j) {
                    Integer poll = arr2[tmp].list.poll();
                    if (!bfsCheck[poll]) q.offer(poll);
                }
            }
        }

    }

    private static void dfs(int node) {
        Integer nextNode;
        System.out.print(node + " ");
        while (true) {
            nextNode = arr[node].list.poll();
            if (nextNode == null) return;
            if (!check[nextNode]) break;
        }
        check[nextNode] = true;
        dfs(nextNode);
    }

    public static class Point {
        PriorityQueue<Integer> list;

        public Point(PriorityQueue<Integer> list) {
            this.list = list;
        }
    }
}

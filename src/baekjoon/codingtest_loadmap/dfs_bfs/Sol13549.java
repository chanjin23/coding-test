package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.*;
import java.io.*;

public class Sol13549 {
    static int n, k;
    static int[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        check = new int[100001];
        Arrays.fill(check, Integer.MAX_VALUE);

        if (n >= k) {
            System.out.println(n - k);
            return;
        }

        bfs();

        System.out.println(check[k]);
    }

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();

        q.offer(n);
        check[n] = 0;

        while (!q.isEmpty()) {
            int now = q.poll();

            //bfs 이므로 check 값이 일정이상이라는건 이미 최소경로는 다구했다는의미이므로 return
            if (check[now] >= check[k]) return;

            for (int i = 0; i < 3; ++i) {
                int next;

                if (i == 0) next = now * 2;
                else if (i == 1) next = now + 1;
                else next = now - 1;

                if (next < 0 || next > 100000) continue;

                if (check[now] + 1 < check[next] && i != 0) {
                    q.offer(next);
                    check[next] = check[now] + 1;
                } else if (check[now] < check[next] && i == 0) {
                    q.offer(next);
                    check[next] = check[now];
                }
            }
        }
    }
}

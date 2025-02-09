package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.*;
import java.io.*;

public class Sol12851 {
    //숨바꼭질2
    static int n, m, count, min;
    static int[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        check = new int[100001];
        Arrays.fill(check, Integer.MAX_VALUE);
        count = 0;

        if (n >= m) {
            System.out.println(n - m);
            System.out.println(1);
            return;
        }

        bfs();

        System.out.println(check[m]);
        System.out.println(count);
    }

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(n);
        check[n] = 0;
        while (!q.isEmpty()) {
            int now = q.poll();

            if (check[m] < check[now]) return;
            for (int i = 0; i < 3; ++i) {
                int next = 0;

                if (i == 0) next = now * 2;
                else if (i == 1) next = now + 1;
                else next = now - 1;

                if (next < 0 || next > 100000) continue;

                //bfs 이므로 다음값이 현재 값보다 더 커질수는 없음. 그렇기때문에 < 안해도됨. 근데 해도됨.
                if (check[now] + 1 <= check[next]) {
                    q.offer(next);
                    check[next] = check[now] + 1;
                    //이미 지나갔던 곳에 최소시간만 봤기때문에 count 를 해도 최단경로의 경우만 counting 됨.
                    if (next == m) {
                        count++;
                    }
                }

            }
        }
    }
}

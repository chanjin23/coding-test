package baekjoon.codingtest_loadmap.basicalgorithm;

import java.util.*;
import java.io.*;

public class Sol2667 {
    static int n,danjiCnt;
    static int[][] arr;
    static List<Integer> answer;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        danjiCnt = 0;
        answer = new ArrayList<>();
        sc.nextLine();

        arr = new int[n][n];
        for (int i = 0; i < n; ++i) {
            char[] input = sc.nextLine().toCharArray();
            for (int j = 0; j < input.length; ++j) {
                arr[i][j] = input[j] - '0';
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                    danjiCnt++;
                    int houseCnt = bfs(new Point(i, j), 1);
                    answer.add(houseCnt);
                }
            }
        }

        Collections.sort(answer);

        System.out.println(danjiCnt);
        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static int bfs(Point p,int count) {
        Queue<Point> q = new LinkedList<>();
        q.offer(p);
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; ++i) {
                int nx = dx[i] + tmp.x;
                int ny = dy[i] + tmp.y;
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 1) {
                    arr[nx][ny] = 0;
                    count++;
                    q.offer(new Point(nx, ny));
                }
            }
        }
        return count;
    }

    public static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

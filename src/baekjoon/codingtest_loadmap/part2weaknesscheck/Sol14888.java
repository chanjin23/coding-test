package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.Scanner;

public class Sol14888 {
    //연산자 끼워넣기
    static int n, minValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE;
    static int[] arr, operator;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        operator = new int[4];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; ++i) {
            operator[i] = sc.nextInt();
        }

        dfs(0, arr[0]);
        System.out.println(maxValue);
        System.out.println(minValue);
    }

    public static void dfs(int level, int total) {
        if (level == n - 1) {
            minValue = Math.min(minValue, total);
            maxValue = Math.max(maxValue, total);
        } else {
            for (int i = 0; i < 4; ++i) {
                if (operator[i] == 0) continue;

                if (i == 0) {
                    operator[i]--;
                    dfs(level + 1, total + arr[level + 1]);
                } else if (i == 1) {
                    operator[i]--;
                    dfs(level + 1, total - arr[level + 1]);
                } else if (i == 2) {
                    operator[i]--;
                    dfs(level + 1, total * arr[level + 1]);
                } else {
                    operator[i]--;
                    dfs(level + 1, total / arr[level + 1]);
                }

                operator[i]++;
            }
        }
    }

}

package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.Scanner;

public class Sol14888 {
    //연산자 끼워넣기
    static int n,max, min;
    static int[] arr;
    static int[] operator;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        operator = new int[4];
        for (int i = 0; i < 4; ++i) {
            operator[i] = sc.nextInt();
        }

        dfs(1,arr[0]);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int level, int total) {
        if (level == n) {
            max = Math.max(max, total);
            min = Math.min(min, total);
        } else {
            for (int i = 0; i < 4; ++i) {
                if (operator[i] > 0) {
                    operator[i]--;
                    if (i == 0) {
                        //덧셈
                        dfs(level + 1, total + arr[level]);
                    } else if (i == 1) {
                        //뺼샘
                        dfs(level + 1, total - arr[level]);
                    } else if (i == 2) {
                        //곱셈
                        dfs(level + 1, total * arr[level]);
                    } else if (i == 3) {
                        //나눗셈
                        dfs(level + 1, total / arr[level]);
                    }
                    operator[i]++;
                }
            }
        }
    }
}

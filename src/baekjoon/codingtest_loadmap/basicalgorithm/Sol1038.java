package baekjoon.codingtest_loadmap.basicalgorithm;

import java.util.Scanner;

public class Sol1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[1000001];

        for (int i = 0; i <= 9; ++i) {
            arr[i] = i;
        }

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int idx = 10;
        for (long i = 10; i <= 9876543210L; ++i) {
            long tmp = i;
            long value = tmp % 10;
            tmp /= 10;
            boolean flag = false;
            while (value < tmp % 10) {
                value = tmp % 10;
                tmp /= 10;
                if (tmp == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                arr[idx] = i;
                idx++;
            }
        }

        if (arr[n] == 0) System.out.println(-1);
        else System.out.println(arr[n]);
    }
}

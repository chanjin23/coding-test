package baekjoon.factormultiple2;

import java.util.Scanner;

public class Sol1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[] arr = new boolean[1000001];
        arr[1] = true;

        for (int i = 2; i <= n; ++i) {
            if (arr[i]) continue;
            int tmp = i;
            while (tmp <= 1000000) {
                arr[tmp] = true;
                tmp += i;
            }
            if (i >= m) {
                System.out.println(i);
            }
        }
    }
}

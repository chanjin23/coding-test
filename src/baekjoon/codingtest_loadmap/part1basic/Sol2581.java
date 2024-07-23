package baekjoon.codingtest_loadmap.part1basic;

import java.util.Scanner;

public class Sol2581 {
    //소수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[] check = new boolean[n + 1];

        int total=0;
        int min=Integer.MAX_VALUE;
        for (int i = 2; i <= n; ++i) {
            if(check[i]) continue;

            if (!check[i] && i >= m && i <= n) {
                min = Math.min(min, i);
                total += i;
            }

            for (int j = i; j <= n; j = j + i) {
                check[j]= true;
            }
        }

        if(total==0) System.out.println(-1);
        else {
            System.out.println(total);
            System.out.println(min);
        }
    }
}

package baekjoon.codingtest_loadmap.part1basic;

import java.util.Scanner;

public class Sol2609 {
    //최대공약수와 최소공배수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int gcd =gcd(n, m);
        int bcd = n * m / gcd;

        System.out.println(gcd);
        System.out.println(bcd);
    }

    private static int gcd(int n, int m) {
        int remain=n%m;
        if (remain == 0) {
            return m;
        }
        return gcd(m, remain);
    }
}

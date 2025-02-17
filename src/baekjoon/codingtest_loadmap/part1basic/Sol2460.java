package baekjoon.codingtest_loadmap.part1basic;

import java.util.Scanner;

public class Sol2460 {
    //지능형 기차2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int total = 0;

        for (int i = 0; i < 10; ++i) {
            int out = sc.nextInt();
            int in = sc.nextInt();
            total = total - out + in;
            max = Math.max(max, total);
        }

        System.out.println(max);
    }
}

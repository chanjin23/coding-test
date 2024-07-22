package baekjoon.codingtest_loadmap.part1basic;

import java.util.Scanner;

public class Sol2460 {
    //지능형 기차2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max=Integer.MIN_VALUE;
        int count=0;

        for (int i = 0; i < 10; ++i) {
            int out = sc.nextInt();
            int in = sc.nextInt();

            count = count + in - out;
            if(count>10000) count=10000;

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}

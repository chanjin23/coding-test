package baekjoon.codingtest_loadmap.basicalgorithm;

import java.util.Scanner;

public class Sol1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long s = sc.nextLong();

        long num = 1;
        long tot = 0;
        while (true) {
            tot += num;
            if (tot > s) {
                break;
            }
            num++;
        }

        System.out.println(num-1);
    }
}

package baekjoon.factormultiple2;

import java.util.Scanner;

public class Sol13241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long bcd = bcd(a, b);
        long answer = a * b / bcd;
        System.out.println(answer);
    }

    public static long bcd(long a, long b) {
        if (a % b == 0) return b;
        else return bcd(b, a % b);
    }
}

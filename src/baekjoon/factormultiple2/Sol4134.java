package baekjoon.factormultiple2;

import java.util.*;

public class Sol4134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; ++i) {
            long num = sc.nextLong();
            if (num == 0 || num == 1) {
                System.out.println(2);
                continue;
            }

            while (true) {
                boolean flag = true;
                for (long j = 2; j <= Math.sqrt(num); ++j) {
                    if (num % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(num);
                    break;
                }
                num++;
            }

        }


    }
}

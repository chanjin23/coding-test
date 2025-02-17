package baekjoon.codingtest_loadmap.part1basic;

import java.util.*;
import java.io.*;

public class Sol3460 {
    //이진수
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = sc.nextInt();
        for (int i = 0; i < t; ++i) {
            int n = sc.nextInt();
            int idx = 0;
            List<Integer> list = new ArrayList<>();
            while (n > 0) {
                if (n % 2 == 1) {
                    list.add(idx);
                }
                n /= 2;
                idx++;
            }
            for (int value : list) {
                bw.write(value + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}

package baekjoon.codingtest_loadmap.part2weaknesscheck;


import java.util.*;
import java.io.*;

public class Sol1806 {
    //부분 합
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long s = Long.parseLong(st.nextToken());
        long[] arr = new long[(int) n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        int lt = 0;
        int rt = 0;
        long tmp = 0;
        int answer = Integer.MAX_VALUE;

        while (rt < n) {
            if (tmp < s) {
                tmp += arr[rt];
                rt++;
            } else {
                answer = Math.min(answer, rt - lt);
                tmp -= arr[lt];
                lt++;
            }
        }

        while (tmp >= s) {
            answer = Math.min(answer, rt - lt);
            tmp -= arr[lt];
            lt++;
        }


        if (answer == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }

}

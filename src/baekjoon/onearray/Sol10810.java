package baekjoon.onearray;

import java.util.*;
import java.io.*;
public class Sol10810 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] num = new int[N];
        for (int i = 0; i < N; ++i) {
            num[i] = i + 1;
        }

        int i = 0, j = 0, k = 0;
        int[] count = new int[N];
        for (int z = 0; z < M; ++z) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken())-1;
            j = Integer.parseInt(st.nextToken())-1;
            k = Integer.parseInt(st.nextToken());

            for (int h = i; h <= j; ++h) {
                count[h] = k;
            }
        }
        br.close();

        for (int c : count) {
            System.out.print(c+" ");
        }

    }
}

package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.*;
import java.io.*;

public class Sol14719 {
    //빗물
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[][] arr = new int[x][y];
        int answer = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < y; ++i) {
            int n = Integer.parseInt(st.nextToken());
            for (int j = 0; j < n; ++j) {
                arr[j][i] = 1;
            }
        }

        for (int i = 0; i < x; ++i) {
            int first = 0;
            int last = 0;
            int count = 0;

            for (int j = 0; j < y; ++j) {
                if (arr[i][j] == 1) {
                    first = j;
                    break;
                }
            }
            for (int j = y - 1; j >= 0; --j) {
                if (arr[i][j] == 1) {
                    last = j;
                    break;
                }
            }

            if (first < last) {
                for (int j = first + 1; j < last; ++j) {
                    if (arr[i][j] == 0) {
                        count++;
                    }
                }
                answer += count;
            }
        }

        System.out.println(answer);
    }
}

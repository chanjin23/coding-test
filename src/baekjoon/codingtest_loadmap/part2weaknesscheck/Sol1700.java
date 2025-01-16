package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.*;
import java.io.*;

public class Sol1700 {
    //멀티탭 스케줄링
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (n >= k) {
            System.out.println(0);
            return;
        }

        int[] plug = new int[n];
        int[] arr = new int[k];
        int[] visited = new int[k + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; ++i) {
            int value = Integer.parseInt(st.nextToken());
            arr[i] = value;
            visited[value]++;
        }
        for (int i = 0; i < k; ++i) {
            int min = Integer.MAX_VALUE;
            int idx = 0;
            boolean flag = false;

            for (int j = 0; j < n; ++j) {
                if (plug[j] == arr[i]) {
                    visited[arr[i]]--;
                    flag = true;
                    break;
                }
                if (plug[j] == 0) {
                    plug[j] = arr[i];
                    visited[arr[i]]--;
                    flag = true;
                    break;
                }
            }
            if(flag) continue;

            for (int j = 0; j < n; ++j) {
                if (min > visited[plug[j]]) {
                    min = visited[plug[j]];
                    idx = j;
                }
            }
            plug[idx] = arr[i];
            visited[arr[i]]--;
            count++;
        }

        System.out.println(count);
    }
}

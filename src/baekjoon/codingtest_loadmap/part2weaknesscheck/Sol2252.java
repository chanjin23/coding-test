package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.*;
import java.io.*;

public class Sol2252 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; ++i) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; ++i) {
            st = new StringTokenizer(br.readLine());
            int input1 = Integer.parseInt(st.nextToken());
            int input2 = Integer.parseInt(st.nextToken());
            list.get(input1).add(input2);
            arr[input2]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; ++i) {
            if (arr[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int tmp = q.poll();
            answer.add(tmp);
            int len = list.get(tmp).size();
            for (int i = 0; i < len; ++i) {
                int value= list.get(tmp).get(i);
                arr[value]--;
                if (arr[value] == 0) {
                    q.offer(value);
                }
            }
        }

        for (int i : answer) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }
}

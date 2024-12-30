package baekjoon.setandmap;

import java.io.*;
import java.util.*;

public class Sol10815 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            map.put(Integer.parseInt(st.nextToken()), 1);
        }

        int m = Integer.parseInt(br.readLine());
        int[] answer = new int[m];
        int tmp = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; ++i) {
            tmp = Integer.parseInt(st.nextToken());
            if (map.containsKey(tmp)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }

            bw.write(answer[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}

package baekjoon.setandmap;

import java.util.*;
import java.io.*;

public class Sol10816 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            int card = Integer.parseInt(st.nextToken());
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; ++i) {
            int answer = Integer.parseInt(st.nextToken());
            bw.write(map.getOrDefault(answer, 0) + " ");
        }

        bw.flush();
        bw.close();
    }
}

package baekjoon.setandmap;

import java.util.*;
import java.io.*;

public class Sol1269 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> tmp = new HashSet<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            int input = Integer.parseInt(st.nextToken());
            set1.add(input);
            tmp.add(input);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; ++i) {
            set2.add(Integer.parseInt(st.nextToken()));
        }

        set1.removeAll(set2);
        set2.removeAll(tmp);

        System.out.println(set1.size() + set2.size());
    }
}

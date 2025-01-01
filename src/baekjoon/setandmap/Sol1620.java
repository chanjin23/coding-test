package baekjoon.setandmap;

import java.util.*;
import java.io.*;

public class Sol1620 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> findByString = new HashMap<>();
        HashMap<String, Integer> findByInteger = new HashMap<>();

        for (int i = 1; i <= n; ++i) {
            String input = br.readLine();
            findByString.put(i, input);
            findByInteger.put(input, i);
        }

        for (int i = 0; i < m; ++i) {
            String answer = br.readLine();
            try {
                //숫자인경우
                System.out.println(findByString.get(Integer.parseInt(answer)));
            } catch (Exception e) {
                //문자인경우
                System.out.println(findByInteger.get(answer));
            }
        }

    }
}

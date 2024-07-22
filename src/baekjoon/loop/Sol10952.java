package baekjoon.loop;

import java.util.*;
import java.io.*;
public class Sol10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] num = new int[2];
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            num[0] = Integer.parseInt(st.nextToken());
            num[1] = Integer.parseInt(st.nextToken());
            if (num[0] == 0 && num[1] == 0) {
                break;
            }
            bw.write(String.valueOf(num[0] + num[1]));
            bw.newLine();
        }
        br.close();

        bw.flush();
        bw.close();
    }
}

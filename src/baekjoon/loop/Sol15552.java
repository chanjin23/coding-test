package baekjoon.loop;

import java.util.*;
import java.io.*;
public class Sol15552 {
    public static void main(String[] args) throws IOException{
        //빠른 A+B
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] input = new int[2];
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine()," ");
            input[0] = Integer.parseInt(st.nextToken());
            input[1] = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf((input[0] + input[1])));
            bw.newLine();
        }

        br.close();

        bw.flush();
        bw.close();
    }
}

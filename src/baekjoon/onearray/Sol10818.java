package baekjoon.onearray;

import java.util.*;
import java.io.*;

public class Sol10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] num = new int[input];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < input; ++i) {
            num[i] = Integer.parseInt(st.nextToken());
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.print(min + " " + max);

        br.close();
    }
}

package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.*;
import java.io.*;

public class Sol14719 {
    //빗물
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int total = 0;
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[] height = new int[w];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < w; ++i) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < w - 1; ++i) {
            int lt = 0;
            int rt = 0;
            for (int j = i - 1; j >= 0; j--) {
                lt = Math.max(height[j], lt);
            }
            for (int j = i + 1; j < w; ++j) {
                rt = Math.max(height[j], rt);
            }

            int rain = Math.min(lt, rt) - height[i];
            if(rain>0) total += rain;
        }
        System.out.println(total);
    }
}

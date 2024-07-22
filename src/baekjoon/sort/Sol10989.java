package baekjoon.sort;

import java.util.*;
import java.io.*;

public class Sol10989 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] memory=new int[10001];
        for (int i = 0; i < n; ++i) {
            memory[arr[i]]++;
        }
        for (int i = 0; i < memory.length; ++i) {
            int tmp = memory[i];
            for (int j = 0; j < tmp; ++j) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}

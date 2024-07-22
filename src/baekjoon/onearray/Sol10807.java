package baekjoon.onearray;

import java.io.*;
import java.util.*;
public class Sol10807 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int findNum = Integer.parseInt(br.readLine());
        int[] input = new int[n];
        for (int i = 0; i < n; ++i) {
            input[i]=Integer.parseInt(st.nextToken());
        }
        int count =0;
        for (int i : input) {
            if(i==findNum) count++;
        }
        System.out.println(count);

    }
}

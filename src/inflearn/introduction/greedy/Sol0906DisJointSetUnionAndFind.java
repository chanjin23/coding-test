package inflearn.introduction.greedy;

import java.util.*;
import java.io.*;

public class Sol0906DisJointSetUnionAndFind {
    static int[] arr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            arr[i] = i;
        }

        for (int i = 0; i < m; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            union(x, y);
        }

        st = new StringTokenizer(br.readLine());
        int friend1 = Integer.parseInt(st.nextToken());
        int friend2 = Integer.parseInt(st.nextToken());

        if (find(friend1)==find(friend2)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void union(int x, int y) {
        int a = find(x);
        int b = find(y);
        if(arr[a]!=arr[b]) arr[a] = arr[b];
    }

    public static int find(int value) {
        if(arr[value]==value) return value;
        else return arr[value] = find(arr[value]);
    }
}

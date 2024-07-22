package baekjoon.sort;

import java.util.*;
import java.io.*;
public class Sol1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Point[] arr = new Point[n];
        for (int i = 0; i < n; ++i) {
            String tmp = br.readLine();
            arr[i] = new Point(tmp, tmp.length());
        }
        Arrays.sort(arr);


    }

    public static class Point implements Comparable<Point>{
        String name;
        int len;

        public Point(String name, int len) {
            this.name = name;
            this.len = len;
        }

        @Override
        public int compareTo(Point o) {
            if(len==o.len) return compareTo(o);
            return len-o.len;
        }
    }
}

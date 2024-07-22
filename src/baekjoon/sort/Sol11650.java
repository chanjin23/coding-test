package baekjoon.sort;

import java.util.*;
import java.io.*;
public class Sol11650 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Point[] arr = new Point[n];
        for (int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Point(x, y);
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; ++i) {
            int x = arr[i].x;
            int y = arr[i].y;
            bw.write(String.valueOf(x) + " " + String.valueOf(y));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    public static class Point implements Comparable<Point>{
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if(o.x==x) return y - o.y;
            return x - o.x;
        }
    }
}

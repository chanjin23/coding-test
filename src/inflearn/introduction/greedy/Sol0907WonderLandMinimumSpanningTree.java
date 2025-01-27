package inflearn.introduction.greedy;

import java.util.*;
import java.io.*;

public class Sol0907WonderLandMinimumSpanningTree {
    static int v, e, answer;
    static List<Point> list;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();
        arr = new int[v + 1];
        answer = 0;

        for (int i = 1; i <= v; ++i) {
            arr[i] = i;
        }

        for (int i = 0; i < e; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list.add(new Point(start, end, cost));
        }

        Collections.sort(list);

        for (Point p : list) {
            union(p.start, p.end, p.cost);
        }

        System.out.println(answer);
    }

    public static void union(int start, int end, int cost) {
        int a = find(start);
        int b = find(end);
        if (a != b) {
            arr[a] = arr[b];
            answer += cost;
        }
    }

    public static int find(int value) {
        if(arr[value]==value) return value;
        else return arr[value] = find(arr[value]);
    }

    public static class Point implements Comparable<Point> {
        int start;
        int end;
        int cost;

        Point(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        public int compareTo(Point o) {
            return this.cost - o.cost;
        }
    }
}

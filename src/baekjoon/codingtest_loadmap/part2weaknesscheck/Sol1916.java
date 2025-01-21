package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.*;
import java.io.*;

public class Sol1916 {
    static int n, m, start, arrive;
    static int[] arr;
    static PriorityQueue<Point> queue = new PriorityQueue<>();
    static ArrayList<ArrayList<Point>> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        arr = new int[n + 1];
        Arrays.fill(arr, Integer.MAX_VALUE);

        for (int i = 0; i <= n; ++i) list.add(new ArrayList<>());

        for (int i = 0; i < m; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            list.get(first).add(new Point(last, weight));
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        arrive = Integer.parseInt(st.nextToken());

        solution(start);

        System.out.println(arr[arrive]);

    }

    public static void solution(int start) {
        arr[start] = 0;
        queue.offer(new Point(start, 0));
        while (!queue.isEmpty()) {
            Point tmp = queue.poll();
            int currentNode = tmp.nextNode;
            int currentWeight = tmp.weight;

            if (arr[currentNode] < currentWeight) continue;
            for (Point p : list.get(currentNode)) {
                if (arr[p.nextNode] > currentWeight + p.weight) {
                    arr[p.nextNode] = currentWeight + p.weight;
                    queue.offer(new Point(p.nextNode, currentWeight + p.weight));
                }
            }
        }
    }

    public static class Point implements Comparable<Point> {
        int nextNode;
        int weight;

        Point(int nextNode, int weight) {
            this.nextNode = nextNode;
            this.weight = weight;
        }

        public int compareTo(Point o) {
            return this.weight - o.weight;
        }
    }
}



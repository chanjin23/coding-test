package inflearn.introduction.dynamicprogramming;

import java.util.*;
public class Sol1004BuildTheTallestTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int area = sc.nextInt();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            list.add(new Point(area, height, weight));
        }
        Collections.sort(list);
        for (Point p : list) {
            System.out.print(p.area+" ");
        }
        int[] maxHeight = new int[n];
        maxHeight[0] = list.get(0).height;
        int answer = maxHeight[0];
        for (int i = 1; i < n; ++i) {
            int max=0;
            for (int j = i - 1; j >= 0; --j) {
                if(list.get(i).weight <list.get(j).weight){
                    max = Math.max(max, maxHeight[j]);
                }
            }
            maxHeight[i] = max + list.get(i).height;
            answer = Math.max(answer, maxHeight[i]);
        }
        System.out.println(answer);
    }

    public static class Point implements Comparable<Point> {

        int area, height, weight;

        public Point(int area, int height, int weight) {
            this.area = area;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Point o) {
            return o.area - area;
        }
    }
}

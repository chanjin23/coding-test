package inflearn.introduction.greedy;

import javax.naming.PartialResultException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sol0901Wrestler {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Point[] arr = new Point[n];
//        for (int i = 0; i < n; ++i) {
//            int height = sc.nextInt();
//            int weight = sc.nextInt();
//            arr[i] = new Point(height, weight);
//        }
//        int[] check = new int[n];
//        for (int i = 0; i < n; ++i) {
//            Point a=arr[i];
//            for (int j = 0; j < n; ++j) {
//                Point b = arr[j];
//                if(check[j]==1) continue;
//                if (a.height < b.height && a.weight < b.weight) {
//                    check[i]=1;
//                }
//            }
//        }
//        int answer=0;
//        for (int i = 0; i < n; ++i) {
//            if (check[i] == 0) {
//                ++answer;
//            }
//        }
//        System.out.println(answer);
//    }
//    public static class Point{
//        int height;
//        int weight;
//
//        public Point(int height, int weight) {
//            this.height = height;
//            this.weight = weight;
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            list.add(new Point(height, weight));
        }
        Collections.sort(list);
        int max=-1;
        int answer=0;
        for (Point p : list) {
            if (p.weight > max) {
                answer++;
                max=p.weight;
            }
        }
        System.out.println(answer);
    }
    public static class Point implements Comparable<Point>{
        int height;
        int weight;

        public Point(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Point o) {
            return o.height-height;
        }
    }
}

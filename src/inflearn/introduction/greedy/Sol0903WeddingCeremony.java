package inflearn.introduction.greedy;

import java.util.*;
public class Sol0903WeddingCeremony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int start = sc.nextInt();
            list.add(new Point(start, 's'));
            int end = sc.nextInt();
            list.add(new Point(end, 'e'));
        }
        Collections.sort(list);
        int count=0;
        int max=-1;
        for (Point p : list) {
            if (p.arrive == 's') {
                count++;
            }else{
                count--;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
    public static class Point implements Comparable<Point>{
        int time;
        char arrive;

        public Point(int time, char arrive) {
            this.time = time;
            this.arrive = arrive;
        }
        @Override
        public int compareTo(Point o){
            if(time==o.time) return arrive - o.arrive;
            return time - o.time;
        }
    }
}

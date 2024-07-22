package inflearn.introduction.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sol0902ConferenceRoomAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Point> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new Point(start, end));
        }
        Collections.sort(list);
        int tmp = list.get(0).end;
        int answer=1;
        for (int i = 1; i < list.size(); ++i) {
            if (tmp <= list.get(i).start) {
                tmp = list.get(i).end;
                answer++;
            }
        }
        System.out.println(answer);
    }
    public static class Point implements Comparable<Point>{
        int start;
        int end;

        public Point(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Point o) {
            if(end==o.end) return start - o.start;
            return end - o.end;
        }
    }
}

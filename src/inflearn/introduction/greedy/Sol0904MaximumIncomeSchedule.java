package inflearn.introduction.greedy;

import java.util.*;

public class Sol0904MaximumIncomeSchedule {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<Point> list = new ArrayList<>();
//        for (int i = 0; i < n; ++i) {
//            int money = sc.nextInt();
//            int day = sc.nextInt();
//            list.add(new Point(money, day));
//        }
//        Collections.sort(list);
//        ArrayList<Integer> list2 = new ArrayList<>();
////        for (Point point : list) {
////            System.out.println(point.money+" "+point.day);
////        }
//
//
//        int answer = 0;
//        int i = list.get(0).day;
//        int j = 0;
//        for (; i > 0; --i) {
//            for (; j<n; ++j) {
//                if (i == list.get(j).day) {
//                    list2.add(list.get(j).money);
//                } else {
//                    break;
//                }
//            }
//            if (!list2.isEmpty()) {
//                Collections.sort(list2, Collections.reverseOrder());
//                answer += list2.get(0);
//                list2.remove(0);
//            }
//        }
//        System.out.println(answer);
//    }
//    public static class Point implements Comparable<Point>{
//        int money, day;
//
//        public Point(int money, int day) {
//            this.money = money;
//            this.day = day;
//        }
//
//        @Override
//        public int compareTo(Point o) {
//            return o.day - day;
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int money = sc.nextInt();
            int day = sc.nextInt();
            list.add(new Point(money, day));
        }
        Collections.sort(list);
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int max = list.get(0).day;
        int j=0;
        int answer=0;
        for (int i = max; i > 0; --i) {
            for (; j < n; ++j) {
                if (i == list.get(j).day) {
                    pQ.offer(list.get(j).money);
                }else break;
            }
            if (!pQ.isEmpty()) {
                answer+=pQ.poll();
            }
        }
        System.out.println(answer);
    }

    public static class Point implements Comparable<Point> {
        int money;
        int day;

        public Point(int money, int day) {
            this.money = money;
            this.day = day;
        }
        @Override
        public int compareTo(Point o){
            return o.day - day;
        }

    }
}

package inflearn.introduction.greedy;

import java.util.*;

public class Sol0905DijkstraAlgorithm {
    //입력 예제
//     6 9
//     1 2 12
//     1 3 4
//     2 1 2
//     2 3 5
//     2 5 5
//     3 4 5
//     4 2 2
//     4 5 5
//     6 4 5
    //출력 예제
    //2 : 11
    //3 : 4
    //4 : 9
    //5 : 14
    //6 : impossible
    static ArrayList<ArrayList<Point>> list;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        list = new ArrayList<>();
        arr = new int[n + 1];
        Arrays.fill(arr, Integer.MAX_VALUE);
        for (int i = 0; i <= n; ++i) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; ++i) {
            int currentNode = sc.nextInt();
            int nextNode = sc.nextInt();
            int weight = sc.nextInt();
            list.get(currentNode).add(new Point(nextNode, weight));
        }
        solution(1);
        for (int i = 2; i <= n; ++i) {
            if (arr[i] == Integer.MAX_VALUE) {
                System.out.println(i + " : impossible");
            } else {
                System.out.println(i + " : " + arr[i]);
            }
        }
    }

    public static void solution(int nextNode) {
        PriorityQueue<Point> pQ = new PriorityQueue<>();
        pQ.offer(new Point(nextNode, 0));
        while (!pQ.isEmpty()) {
            Point tmp = pQ.poll();
            int currentNode = tmp.nextNode;
            int currentWeight = tmp.weight;

            if (arr[currentNode] < currentWeight) continue;//arr[현재노드] 값보다 가중치값이 크면 갱신할필요가 x, 없으면 시간복잡도 상승
            for (Point p : list.get(currentNode)) {
                if (arr[p.nextNode] > currentWeight + p.weight) {
                    arr[p.nextNode] = currentWeight + p.weight;
                    pQ.offer(new Point(p.nextNode, currentWeight + p.weight));
                }
            }
        }
    }

    public static class Point implements Comparable<Point> {
        int nextNode;
        int weight;

        public Point(int nextNode, int weight) {
            this.nextNode = nextNode;
            this.weight = weight;
        }

        @Override
        public int compareTo(Point o) {
            return weight - o.weight;
        }
    }
}

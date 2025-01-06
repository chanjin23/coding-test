package baekjoon.stackandqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sol11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; ++i) {
            q.offer(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            for (int i = 0; i < k - 1; ++i) {
                q.offer(q.poll());
            }
            list.add(q.poll());
        }
        System.out.print("<");
        for (int i = 0; i < list.size(); ++i) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + ">");
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
    }
}

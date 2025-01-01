package baekjoon.setandmap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sol14425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int count =0;

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; ++i) {
            set.add(sc.nextLine());
        }

        for (int i = 0; i < m; ++i) {
            if (set.contains(sc.nextLine())) {
                count++;
            }
        }
        System.out.println(count);
    }
}

package baekjoon.onearray;

import java.util.*;
import java.io.*;
public class Sol10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N];
        for (int i = 0; i < N; ++i) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < M; ++i) {
            int first = sc.nextInt() - 1;
            int second = sc.nextInt() - 1;
            int tmp=0;
            while (first < second) {
                tmp = basket[first];
                basket[first] = basket[second];
                basket[second] = tmp;
                first++;
                second--;
            }
        }

        for (int i = 0; i < N; ++i) {
            System.out.print(basket[i] +" ");
        }

        sc.close();
    }
}

package baekjoon.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sol1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        ArrayList<Long> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n/=10;
        }
        long answer=0;
        Collections.sort(list, Collections.reverseOrder());
        for (long i : list) {
            answer=answer*10+i;
        }
        System.out.println(answer);
    }
}

package baekjoon.string;

import java.util.*;
import java.io.*;
public class Sol11720 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        sc.nextLine();  //개행문자가 먹히기 때문에 추가해줘야 함.
        String input =sc.nextLine();
//        System.out.println(N);
//        System.out.println(input);

        int sum =0;
        for (int i = 0; i < N; ++i) {
            int num =Integer.parseInt(input.substring(i, i + 1));
            sum += num;
        }
        System.out.println(sum);

    }
}

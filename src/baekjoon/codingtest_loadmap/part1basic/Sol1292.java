package baekjoon.codingtest_loadmap.part1basic;

import java.util.Scanner;

public class Sol1292 {
    //쉽게 푸는 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count=1;
        int total=0;
        boolean check=false;
        for (int i = 1; i < 100; ++i) {
            for (int j = 0; j < i; ++j) {
                if (count > b) {
                    check=true;
                    break;
                }

                if(count>=a){
                    total+=i;
                }
                count++;
            }
            if(check) break;
        }

        System.out.println(total);
    }
}

package baekjoon.codingtest_loadmap.part1basic;

import java.util.Scanner;

public class Sol1978 {
    //소수 찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;

        for (int i = 0; i < n; ++i) {
            int m=sc.nextInt();
            boolean check=false;
            if(m==1) check=true;
            else{
                for (int j = 2; j <= Math.sqrt(m); ++j) {
                    if (m % j == 0) {
                        check=true;
                        break;
                    }
                }
            }
            if(!check) count++;
        }

        System.out.println(count);
    }
}

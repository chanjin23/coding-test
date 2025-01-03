package baekjoon.factormultiple2;

import java.util.Scanner;

public class Sol1735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int son = a * d + b * c;
        int parent = b * d;
        //원래는 유클리드 호제법이용해서 최대공약수 구하고 그걸로 나누는거
        for (int i = 2; i <= 30000; ++i) {
            while (son % i == 0 && parent % i == 0) {
                son /= i;
                parent /= i;
            }
        }
        System.out.println(son+" " +parent);
    }
}

package baekjoon.onearray;

import java.util.*;
public class Sol1546 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        float[] num =new float[N];
        float max =-1;
        for (int i = 0; i < N; ++i) {
            num[i] = sc.nextInt();
            if (num[i] > max) {
                max = num[i];
            }
        }
        float total=0;
        float[] edit = new float[N];
        for (int i = 0; i < N; ++i) {
            edit[i] = num[i] / max * 100;
            total += edit[i];
        }
        sc.close();
        System.out.println((float)(total/N));
    }
}

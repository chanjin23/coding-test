package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sol2309 {
    public static void main(String[] args) {
        //입력 9 -> 출력 7
        //일곱난쟁이의 키의 합이 100
        //1. 9개를 전부다 더해준 다음에 2개를 for문으로 빼면서 값이 100이면 return
        Scanner sc = new Scanner(System.in);
        int total =0;
        int[] key = new int[9];
        for(int i=0;i<9;++i){
            key[i] = sc.nextInt();
            total += key[i];
        }


        for (int i = 0; i < 8; ++i) {
            //9개 중 하나 선택
            for (int j = i+1; j < 9; ++j) {
                //8개중 하나 선택
                if (total - key[i] - key[j] == 100) {
                    key[i]=0;
                    key[j]=0;
                    Arrays.sort(key);
                    for (int k = 2; k < 9; ++k) {
                        System.out.println(key[k]);
                    }
                    System.exit(0);
                }
            }
        }

    }
}

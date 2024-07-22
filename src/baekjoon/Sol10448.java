package baekjoon;

import java.io.*;
import java.util.*;
public class Sol10448 {
    public static void main(String[] args) throws IOException{
        //유레카 이론
        //값을 받아온다.
        //삼각수가 뭔지를 k
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] triNum = new int[45];
        for (int i = 1; i < 45; ++i) {
            triNum[i] = i * (i + 1) / 2;
        }
        int[] result = new int[N];
        for (int i = 0; i < N; ++i) {
            int n = Integer.parseInt(br.readLine());
            result[i] = eureka(n, triNum);
        }
        for (int a : result) {
            System.out.println(a);
        }

    }

    private static int eureka(int n, int[] triNum) {
        for (int j = 1; j < 45; ++j) {
            for (int k = 1; k < 45; ++k) {
                for (int z = 1; z < 45; ++z) {
                    int sum = triNum[j] + triNum[k] + triNum[z];
                    if (sum == n) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

}
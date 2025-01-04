package baekjoon.factormultiple2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[1000001];
        for (int i = 2; i <= 1000000; ++i) {
            if (arr[i] != 0) continue;
            arr[i] = 2;
            int tmp = i + i;
            while (tmp <= 1000000) {
                arr[tmp] = 1;
                tmp += i;
            }
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; ++i) {
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            for (int j = 2; j <= n / 2; ++j) {
                if (n > j && arr[j] == 2 && arr[n - j] == 2) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}

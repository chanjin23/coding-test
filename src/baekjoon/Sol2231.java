package baekjoon;

import java.io.*;
import java.util.Scanner;

public class Sol2231 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i < n; ++i) {
            int tmp =i;
            int sum =0;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if (sum + i == n) {
                bw.write(String.valueOf(i));
                bw.close();
                return;
            }
        }
        bw.write("0");
        bw.close();
    }
}

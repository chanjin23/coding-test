package baekjoon.factormultiple2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sol4948 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int count = 0;
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                break;
            }

            for (int i = input + 1; i <= input * 2; ++i) {
                boolean flag = true;
                for (int j = 2; j <= Math.sqrt(i); ++j) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

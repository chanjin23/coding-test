package baekjoon.codingtest_loadmap.part2weaknesscheck;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol1806 {
    //부분 합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for (; right < n; ++right) {
            sum+=arr[right];

            while (sum >= s) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left++];
            }
        }
        if (minLen == Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(minLen);
    }

}

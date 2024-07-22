package inflearn.introduction.dynamicprogramming;

import java.util.*;
import java.io.*;
public class Sol1006FindTheMaximumScore {
    //무한하면 왼쪽에서 오른쪽 ( 갱신하는방향으로)
    //하나만 사용하면 오른쪽에서 왼쪽으로 (갱신 x)
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] maxScore = new int[m + 1];
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            int score = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            for (int j = m; j>= time; --j) {
                maxScore[j] = Math.max(maxScore[j], score + maxScore[j - time]);
            }
        }
        System.out.println(maxScore[m]);
    }
}

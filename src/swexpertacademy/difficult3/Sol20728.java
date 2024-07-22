package swexpertacademy.difficult3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Sol20728 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.parseInt(br.readLine());
        for (int test = 1; test <= numOfTestCases; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numOfCandy = Integer.parseInt(st.nextToken());
            int numOfKids = Integer.parseInt(st.nextToken());
            ArrayList<Integer> candies = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < numOfCandy; i++) {
                candies.add(Integer.parseInt(st.nextToken()));
            }
            candies.sort(Collections.reverseOrder());
            int answer = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < numOfCandy - numOfKids + 1; ++i) {
                answer = candies.get(i) - candies.get(i + numOfKids - 1);
                min = Math.min(min, answer);
            }
            System.out.println("#" + test + " " + min);
        }
    }
}

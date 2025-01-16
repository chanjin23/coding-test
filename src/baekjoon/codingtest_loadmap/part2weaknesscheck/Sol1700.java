package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.*;
import java.io.*;

public class Sol1700 {
    //멀티탭 스케줄링
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; ++i) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        for (int i = 0; i < k; ++i) {
            //플러그에 이미 꽂혀있는 경우
            if (set.contains(list.get(i))) continue;

            //플러그에 아무것도 꽂혀있지않은경우
            if (set.size() < n) {
                set.add(list.get(i));
                continue;
            }

            //플러그를 교체해야하는경우
            int max = -1;
            int idx = -1;
            List<Integer> subList = list.subList(i + 1, k);
            for (int s : set) {
                int tmp = 0;
                if (subList.contains(s)) {
                    tmp = subList.indexOf(s) + 1;
                } else {
                    tmp = Integer.MAX_VALUE;
                }

                if (tmp > max) {
                    max = tmp;
                    idx = s;
                }
            }
            set.remove(idx);
            set.add(list.get(i));
            count++;
        }

        System.out.println(count);
    }
}

package baekjoon;

import java.util.*;
import java.io.*;

public class Sol1343 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");
        String[] arr = {"AAAA", "BB"};
        int len = input.length;
        int cnt = 0;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < len; ++i) {
            if (input[i].equals(".")) {
                cnt = 0;
                list.add(".");
            } else {
                cnt++;
                if (i + 1 == len || input[i + 1].equals(".")) {
                    if (cnt % 2 == 1) {
                        System.out.println(-1);
                        return;
                    }
                    while (true) {
                        if (cnt == 0) break;
                        if (cnt / 4 > 0) {
                            list.add(arr[0]);
                            cnt -= 4;
                        } else {
                            list.add(arr[1]);
                            break;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i));
        }
    }
}

package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.Arrays;
import java.util.Scanner;

public class Sol16916 {
    //부분 문자열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();

        System.out.println(KMP(s,p));
    }

    public static int KMP(String s, String p) {
        int[] arr = makeTable(p);
        int sLen = s.length();
        int pLen = p.length();
        int idx = 0;

        for (int i = 0; i < sLen; ++i) {
            while (idx > 0 && s.charAt(i) != p.charAt(idx)) {
                idx = arr[idx - 1];
            }

            if (s.charAt(i) == p.charAt(idx)) {
                if (idx == pLen - 1) {
                    return 1;
                } else {
                    idx += 1;
                }
            }
        }
        return 0;
    }

    public static int[] makeTable(String p) {
        int[] arr = new int[p.length()];
        int idx = 0;

        for (int i = 1; i < arr.length; ++i) {
            //연속된 패턴에서 일치하지 않으면 idx 한칸아래의 배열에 접근해서 idx 변경
            while (idx > 0 && p.charAt(idx) != p.charAt(i)) {
                idx = arr[idx - 1];
            }

            if (p.charAt(idx) == p.charAt(i)) {
                idx += 1;
                arr[i] = idx;
            }
        }
        return arr;
    }
}

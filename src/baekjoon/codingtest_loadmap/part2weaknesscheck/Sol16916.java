package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.Scanner;

public class Sol16916 {
    //부분 문자열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();

        char[] chs = s.toCharArray();
        char[] chp = p.toCharArray();

        int hashS = 0;
        int hashP = 0;

        for (int i = 0; i < chp.length; ++i) {
            hashS += chs[i];
            hashP += chp[i];
        }

        for (int i = 0; i < chs.length - chp.length + 1; ++i) {
            if (hashS == hashP) {
                boolean flag = false;
                for (int j = i; j < i + chp.length; ++j) {
                    if (chs[j] != chp[j - i]) {
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    System.out.println(1);
                    return;
                }
            } else {
                if(i==chs.length-chp.length) continue;
                hashS = hashS - chs[i] + chs[i + chp.length];
            }
        }
        System.out.println(0);
    }
}

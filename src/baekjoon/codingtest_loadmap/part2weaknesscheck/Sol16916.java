package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.Scanner;

public class Sol16916 {
    //부분 문자열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        String s = sc.nextLine();

        char[] ch = p.toCharArray();
        for (int i=0;i<ch.length;++i) {
            if(ch[i]!=s.charAt(0)) continue;

            boolean check=false;
            try {
                for (int j = i; j < i + s.length(); ++j) {
                    if (ch[j] != s.charAt(j - i)) {
                        check = true;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(0);
                return;
            }

            if(!check){
                System.out.println(1);
                return;
            }
        }

        System.out.println(0);
    }
}

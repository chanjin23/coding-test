package baekjoon.setandmap;

import java.util.*;
import java.io.*;

public class Sol11478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> set = new HashSet<>();
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int lt = 0;
        for (char c : ch) {
            set.add(String.valueOf(c));
        }
        for (int i = 1; i <= ch.length; ++i) {
            lt = 0;
            int rt = i;
            while (rt < ch.length) {
                set.add(s.substring(lt,rt+1));
                lt++;
                rt++;
            }
        }
//        for (String string : set) {
//            System.out.println(string);
//        }
        System.out.println(set.size());
    }
}

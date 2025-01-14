package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.Scanner;
import java.util.Stack;

public class Sol2504 {
    //괄호의 값
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        String[] strs = n.split("");

        int total = 0;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strs.length; ++i) {
            String str = strs[i];
            int totalTmp = 0;
            try {
                if (str.equals("(") || str.equals("[")) {
                    stack.push(str);
                } else if (str.equals(")")) {
                    while (true) {
                        String tmp = stack.pop();
                        if (tmp.equals("(")) {
                            if (totalTmp == 0) stack.push("2");
                            else {
                                int i1 = 2 * totalTmp;
                                stack.push(String.valueOf(i1));
                            }
                            break;
                        } else {
                            int num = Integer.parseInt(tmp);
                            totalTmp += num;
                        }
                    }
                } else {
                    while (true) {
                        String tmp = stack.pop();
                        if (tmp.equals("[")) {
                            if (totalTmp == 0) stack.push("3");
                            else {
                                int i1 = 3 * totalTmp;
                                stack.push(String.valueOf(i1));
                            }
                            break;
                        } else {
                            int num = Integer.parseInt(tmp);
                            totalTmp += num;
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println(0);
                return;
            }
        }   //for

        try {
            for (String s : stack) {
                total += Integer.parseInt(s);
            }
        } catch (Exception e) {
            System.out.println(0);
            return;
        }
        System.out.println(total);
    }
}

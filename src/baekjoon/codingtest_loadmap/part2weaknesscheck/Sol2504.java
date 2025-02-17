package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.*;

public class Sol2504 {
    //괄호의 값
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strs = sc.nextLine().split("");
        int answer = 0;
        Stack<String> stack = new Stack<>();
        int total = 1;

        for (int i = 0; i < strs.length; ++i) {
            if (strs[i].equals("(")) {
                stack.push("(");
                total *= 2;
            } else if (strs[i].equals("[")) {
                stack.push("[");
                total *= 3;
            } else if (strs[i].equals(")")) {
                if (stack.isEmpty() || stack.peek().equals("[")) {
                    System.out.println(0);
                    return;
                } else {
                    //처음에만 더해준다.
                    if (strs[i - 1].equals("(")) {
                        answer += total;
                    }
                    stack.pop();
                    total /= 2;
                }
            } else {
                if (stack.isEmpty() || stack.peek().equals("(")) {
                    System.out.println(0);
                    return;
                } else {
                    if (strs[i - 1].equals("[")) {
                        answer += total;
                    }
                    stack.pop();
                    total /= 3;
                }
            }
        }

        if(!stack.isEmpty()) System.out.println(0);
        else System.out.println(answer);
    }
}

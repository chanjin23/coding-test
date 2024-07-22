package baekjoon.string;

import java.util.*;
import java.io.*;
public class Sol1152 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input =sc.nextLine().trim();
        String[] word =input.split(" "); //trim을 이용해 첫 번째랑 끝에 공백 제거
        if (input.equals("")) {
            System.out.println(0);
            System.exit(0);
        }
        System.out.println(word.length);
    }
}

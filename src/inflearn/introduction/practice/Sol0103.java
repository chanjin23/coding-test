package inflearn.introduction.practice;

import java.util.*;

public class Sol0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.toCharArray();

        //it is time to study
        String[] strs=str.split(" ");
        int max=-1;
        String answer = "";

        for (String s : strs) {
            int len = s.length();
            if (max < len) {
                max = len;
                answer = s;
            }
        }
        System.out.println(answer);
    }
}

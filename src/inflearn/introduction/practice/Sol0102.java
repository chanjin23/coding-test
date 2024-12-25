package inflearn.introduction.practice;

import java.util.*;

public class Sol0102 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int chSize = ch.length;
        char[] answer = new char[chSize];
        for (int i = 0; i < chSize; ++i) {
            //소문자인경우
            if (ch[i] >= 97 && ch[i] <= 122) {
                answer[i] = (char)(ch[i] - 32);
            }
            //대문자인경우
            else if (ch[i] >= 65 && ch[i] <= 90) {
                answer[i] = (char)(ch[i] + 32);
            }
        }
        System.out.println(new String(answer));

//        System.out.println((int)('a')); //97
//        System.out.println((int)('z')); //122
//        System.out.println((int)('A')); //65
//        System.out.println((int)('Z')); //90
    }
}

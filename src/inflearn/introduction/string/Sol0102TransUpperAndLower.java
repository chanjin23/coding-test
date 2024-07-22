package inflearn.introduction.string;

import java.util.*;
public class Sol0102TransUpperAndLower {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input =sc.nextLine();
        StringBuilder sb=new StringBuilder();
//        System.out.println((int)'a' + " "+(int)'A');
        //소문자에서 32를 빼면 대문자가 된다.
//        for (int i = 0; i < input.length(); ++i) {
//            if(input.charAt(i)>='a'){
//                //소문자인경우
//                sb.append(input.substring(i,i+1).toUpperCase());
//            }else{
//                sb.append(input.substring(i,i+1).toLowerCase());
//            }
//        }
        //향상된 for문과 isUpperCase를 이용해서 문제 해결
        for (char c : input.toCharArray()) {
            if(Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));
        }
        System.out.println(sb);
    }

}

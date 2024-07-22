package inflearn.introduction.string;

import java.util.Scanner;

public class Sol0106EliminateDuplicationString {
    //boolean을 이용하는방법
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        String input =sc.nextLine();
//        StringBuilder sb=new StringBuilder();
//        boolean[] alphabet = new boolean[26];
//        for(int i=0;i<input.length();++i){
//            //false인 값만 출력
//            if(!alphabet[input.charAt(i)-'a']){
//                sb.append(input.charAt(i));
//                alphabet[input.charAt(i)-'a']=true;
//            }
//        }
//        System.out.println(sb);
//    }
    //indexOf를 이용하는방법
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input =sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<input.length();++i){
            //실제 인덱스와 해당 알파벳 인덱스와 비교
            if(input.indexOf(input.charAt(i))==i){
                sb.append(input.charAt(i));
            }
        }
        System.out.println(sb);
    }
}

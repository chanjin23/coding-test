package inflearn.introduction.string;

import java.util.Scanner;

public class Sol0109ExtractNumber {
    //아스키코드를 이용하는 방법
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine().toLowerCase();
        char[] ch =str.toCharArray();
        int output =0;
        for(int i=0;i<str.length();++i){
            if(!(ch[i]>='a'&&ch[i]<='z')){
                output=output*10+(ch[i]-'0');   //다음과 같이 자리수를 올려서 이용할수도있음
            }
        }
        System.out.println(output);
    }
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//
//        String input = sc.nextLine().toLowerCase();
//        StringBuilder sb=new StringBuilder();
//        for (int i = 0; i < input.length(); ++i) {
//            if(input.charAt(i)<'a'||input.charAt(i)>'z'){
//                sb.append(input.charAt(i));
//            }
//        }
//        System.out.println(Integer.parseInt(sb.toString()));
//    }
}

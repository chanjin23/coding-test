package inflearn.introduction.string;

import java.util.Scanner;

public class Sol0103WordInSentence {
    //1.split을 이용해서 푸는방법
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        String input =sc.nextLine();
//        String[] split =input.split(" ");
//        int max=-1;
//        String output = "";
//        for(String s:split){
//            if (max < s.length()) {
//                max=s.length();
//                output=s;
//            }
//        }
//        System.out.println(output);
//    }

    //2.index, substring으로 푸는 방법
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        int max=-1;
        int pos =0;
        String output="";
        //띄어쓰기가 없으면 -1 반환 break
        while((pos=str.indexOf(' '))!=-1){
            String tmp =str.substring(0,pos);   //0~띄어쓰기 전까지
            int len =tmp.length();
            if(max<len){
                max=len;
                output=tmp;
            }
            str=str.substring(pos+1);   //새롭게 갱신
        }
        //마지막 str이 while문에 돌지 않았으므로
        if(str.length()>max){
            output=str;
        }
        System.out.println(output);
    }
}

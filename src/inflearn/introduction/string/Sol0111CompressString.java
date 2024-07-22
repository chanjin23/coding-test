package inflearn.introduction.string;

import java.util.Scanner;

public class Sol0111CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        str=str+" ";    //뒤에 빈문자열을 받는다.
        int count =1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length()-1;++i){
            if(str.charAt(i)==str.charAt(i+1)){
                ++count;
            }else{  //다른경우 결과
                sb.append(str.charAt(i));
                if(count>1){
                    sb.append(String.valueOf(count));
                }
                count =1; //count초기화
            }
        }
        System.out.println(sb);

    }
}

package inflearn.introduction.string;

import java.util.Scanner;

public class Sol0105ReverseSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch =str.toCharArray();
        int first=0;
        int last=str.length()-1;
        while (last > first) {
            //first가 특수문자인경우
//            if(!(ch[first]>='a'&&ch[first]<='z'||ch[first]>='A'&&ch[first]<='Z')){
//                first++;
//            }
            if(!Character.isAlphabetic(ch[first])) first++;    //다음과 같이 메소드를 사용할 수 도있음
            //last가 특수문자인경우
            else if(!(ch[last]>='a'&&ch[last]<='z'||ch[last]>='A'&&ch[last]<='Z')) {
                last--;
            } else{ //first, last둘다 특수문자가 아닌경우
                char tmp = ch[first];
                ch[first] = ch[last];
                ch[last] = tmp;
                first++;
                last--;
            }
        }
        System.out.println(String.valueOf(ch));
    }
}

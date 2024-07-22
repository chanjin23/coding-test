package baekjoon.deep1;

import java.util.*;
public class Sol2941 {
    public static void main(String[] args) {
        //크로아티아 알파벳
        Scanner sc =new Scanner(System.in);
        String input =sc.nextLine();
        int totalCount = input.length();
        for(int i=0;i<input.length()-1;++i){
            if(input.substring(i,i+2).equals("c=")){
                totalCount -= 1;
            }else if(input.substring(i,i+2).equals("c-")) {
                totalCount -= 1;
            } else if(input.substring(i,i+2).equals("d-")) {
                totalCount -= 1;
            }else if(input.substring(i,i+2).equals("lj")) {
                totalCount -= 1;
            }else if(input.substring(i,i+2).equals("nj")) {
                totalCount -= 1;
            }else if(input.substring(i,i+2).equals("s=")) {
                totalCount -= 1;
            }else if(input.substring(i,i+2).equals("z=")) {
                totalCount -= 1;
            }
            //여기서 문제는 dz=와 z=때문에 값이 겹침 + length() IndexException이 터져서 따로한다.
            //그래서 for문을 하나더 만들어서 dz=가 나온부분만 +하고 뺴자.
        }
        for(int i=0;i<input.length()-2;++i){
            if(input.substring(i,i+3).equals("dz=")){
                totalCount -= 1;
            }
            //값이 하나 중복됐으므로 여기서 하나빼준다.
        }
        System.out.println(totalCount);

    }
}

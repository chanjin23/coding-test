package baekjoon.twoarray;

import java.util.*;

public class Sol10798 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char[][] input =new char[5][15];
        int maxLen=0;
        for (int i = 0; i < 5; ++i) {
            String s = sc.nextLine();
            for(int j=0;j<s.length();++j){
                input[i][j] = s.charAt(j);
                if(maxLen<s.length()){
                    maxLen = s.length();
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<maxLen;++i){
            for(int j=0;j<5;++j){
                if(input[j][i]=='\0'){
                    continue;
                }
                sb.append(input[j][i]);
            }
        }
        System.out.println(sb);
        sc.close();
    }
}

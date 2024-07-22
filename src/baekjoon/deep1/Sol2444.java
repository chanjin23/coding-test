package baekjoon.deep1;

import java.io.*;
import java.util.*;
public class Sol2444 {
    public static void main(String[] args) throws IOException {
        //별 찍기 -7
        Scanner sc =new Scanner(System.in);
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        int input =sc.nextInt();
        for(int i=1;i<=input;++i){
            for(int j=1;j<= input-i;++j){
                bw.write(" ");
            }
            for(int k=1;k<=(2*i-1);++k){
                bw.write("*");
            }
            bw.newLine();
        }
        for(int i=1;i<=input-1;++i){
            for(int k=1;k<=i;++k){
                bw.write(" ");
            }
            for(int j=1;j<=(input*2-1)-2*i;++j){
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

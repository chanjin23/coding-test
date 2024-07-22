package baekjoon.factormultiple;

import java.io.*;
import java.util.*;
public class Sol5086 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int large =0;
        int small =0;
        while(true){
            StringTokenizer st =new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x==0 &&y==0) break;

            if(x>=y){
                if(x%y==0){
                    bw.write("multiple");
                    bw.newLine();
                    continue;
                }
            }
            else{
                if(y%x==0){
                    bw.write("factor");
                    bw.newLine();
                    continue;
                }
            }
            bw.write("neither");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

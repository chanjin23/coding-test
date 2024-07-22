package baekjoon.twoarray;

import java.util.*;
import java.io.*;
public class Sol2566 {
    public static void main(String[] args) throws IOException {
        //색종이
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max =Integer.MIN_VALUE;
        int row =0; int column =0;
        int[][] input =new int[9][9];
        for (int i = 0; i < 9; ++i) {
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<9;++j){
                input[i][j]=Integer.parseInt(st.nextToken());
                if(input[i][j]>= max){
                    max=input[i][j];
                    column =i;
                    row =j;
                }
            }
        }
        System.out.println(max);
        System.out.print((column+1)+" "+(row+1));
    }
}

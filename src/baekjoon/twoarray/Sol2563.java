package baekjoon.twoarray;

import java.io.*;
import java.util.*;
public class Sol2563 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        boolean[][] rectangle=new boolean[101][101];    //1~100
        for(int i=0;i<n;++i){
            StringTokenizer st =new StringTokenizer(br.readLine()," ");
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            for (int j = x; j < x+10; ++j) {
                for(int k=y;k<y+10;++k){
                    rectangle[j][k]=true;
                }
            }
        }
        int count =0;
        for(int i=0;i<100;++i){
            for(int j=0;j<100;++j){
                if(rectangle[i][j]==true) count++;
            }
        }
        System.out.println(count);
    }
}

package baekjoon.bruteforce;

import java.util.*;
import java.io.*;
public class Sol2798 {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[] num=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;++i){
            num[i]=Integer.parseInt(st.nextToken());
        }

        int output =0;
        for(int i=0;i<n;++i){
            for(int j=i+1;j<n;++j){
                int total =0;
                for(int k=j+1;k<n;++k){
                    total=num[i]+num[j]+num[k];
                    if(total<=m&&total >output){
                        output=total;
                    }
                }
            }
        }
        System.out.println(output);
    }
}

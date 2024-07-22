package baekjoon.twoarray;

import java.util.*;
import java.io.*;
public class Sol2738 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        //2중for문을 이용해서 행렬을 구한다.
        int[][] array1 = new int[n][m];
        int[][] array2 = new int[n][m];
        for(int i=0;i<n;++i){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;++j){
                array1[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<n;++i){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;++j){
                array2[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                System.out.print((array1[i][j]+array2[i][j])+" ");
            }
            System.out.println();
        }
        br.close();

    }
}

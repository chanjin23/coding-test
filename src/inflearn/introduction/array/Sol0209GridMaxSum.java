package inflearn.introduction.array;

import java.util.*;
import java.io.*;
public class Sol0209GridMaxSum {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] array =new int[n][n];
        for(int i=0;i<n;++i){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;++j){
                array[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int max=0;
        int sum1,sum2;
        for(int i=0;i<n;++i){
            sum1 =sum2=0;
            for(int j=0;j<n;++j){
                sum1+=array[i][j];
                sum2 += array[j][i];
            }
            max=Math.max(max,sum1);
            max=Math.max(max,sum2);
        }

        sum1=sum2=0;
        for(int i=0;i<n;++i){
            sum1+=array[i][i];
            sum2+=array[i][n-1-i];
        }
        max=Math.max(max,sum1);
        max=Math.max(max,sum2);

        System.out.println(max);
    }

}

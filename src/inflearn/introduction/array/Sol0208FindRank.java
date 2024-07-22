package inflearn.introduction.array;

import java.util.*;
import java.io.*;
public class Sol0208FindRank {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] rank =new int[n];
        for(int i=0;i<n;++i){
            rank[i]=Integer.parseInt(st.nextToken());
        }
        int[] answer =new int[n];
        for(int i=0;i<n;++i){
            int count =1;
            for(int j=0;j<n;++j){
                if(rank[j] >rank[i]){
                    ++count;
                }
            }
            answer[i]=count;
        }
        for(int i:answer){
            System.out.print(i+" ");
        }
    }
}

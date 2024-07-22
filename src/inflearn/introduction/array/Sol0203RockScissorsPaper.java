package inflearn.introduction.array;

import java.util.*;
import java.io.*;

public class Sol0203RockScissorsPaper {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st1=new StringTokenizer(br.readLine());
        StringTokenizer st2=new StringTokenizer(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i=0;i<n;++i){
            A[i]=Integer.parseInt(st1.nextToken());
            B[i]=Integer.parseInt(st2.nextToken());
            if(A[i] >B[i]){
                if(A[i]==3&&B[i]==1) System.out.println("B");
                else System.out.println("A");
            }else if(A[i] <B[i]){
                if(B[i]==3&&A[i]==1) System.out.println("A");
                else System.out.println("B");
            }else{
                System.out.println("D");
            }

        }
    }
}

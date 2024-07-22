package inflearn.introduction.sortandsearch;

import java.util.*;
import java.io.*;
public class Sol0601SelectionSort {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int[] arr =new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n;++i){
            int min=1000000;
            int index=0;
            for(int j=i+1;j<n;++j){
                if(min >arr[j]){
                    min=arr[j];
                    index=j;
                }
            }
            if(min <arr[i]){
                int tmp=arr[i];
                arr[i]=arr[index];
                arr[index]=tmp;
            }
        }
        for(int i=0;i<n;++i){
            System.out.print(arr[i]+" ");
        }
    }
}

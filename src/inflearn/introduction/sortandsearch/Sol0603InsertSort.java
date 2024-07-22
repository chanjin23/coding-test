package inflearn.introduction.sortandsearch;

import java.util.*;
import java.io.*;
public class Sol0603InsertSort {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<n;++i){
            for(int j=i-1;j>=0;--j){
                if(arr[j]> arr[j+1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }else break;
            }
        }
        for(int i=0;i<n;++i){
            System.out.print(arr[i]+" ");
        }
    }
}

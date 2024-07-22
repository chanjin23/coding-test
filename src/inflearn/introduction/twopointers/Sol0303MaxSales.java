package inflearn.introduction.twopointers;

import java.util.*;
import java.io.*;
public class Sol0303MaxSales {
    public static void main(String[] args) throws Exception{
        //입력
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        //로직
        long sum=0;
        for(int i=0;i<k;++i){
            sum+=arr[i];
        }
        long max=sum;
        for(int i=1;i<n-k+1;++i){
            sum=sum-arr[i-1]+arr[i+k-1];
            max=Math.max(max,sum);
        }
        System.out.println(max);

    }
}

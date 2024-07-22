package inflearn.introduction.twopointers;

import java.util.*;
import java.io.*;
public class Sol0306MaxLengthOfConsecutiveParts {
    public static void main(String[] args) throws IOException{
        //입력
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] arr =new int[n];
        for(int i=0;i<n;++i){
            arr[i]=(Integer.parseInt(st.nextToken()));
        }

        //로직
        int left=0;
        int right =0;
        int count =0;
        int max =0;
        for(;right<n;++right){
            if(arr[right]==0) count++;
            while(count>k){
                if(arr[left]==0) count--;
                left++;
            }
            int len=right-left+1;
            max=Math.max(max,len);
        }
        System.out.println(max);
    }
}

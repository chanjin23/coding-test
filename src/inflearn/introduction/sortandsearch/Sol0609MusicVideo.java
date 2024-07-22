package inflearn.introduction.sortandsearch;

import java.util.*;
import java.io.*;
public class Sol0609MusicVideo {
    public static void main(String[] args) throws Exception{
        //결정 알고리즘은 문제가 요구하는답이 해당 arr에 크기가 반드시 존재할때만 결정알고리즘을 사용한다.
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        int[] arr =new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        //로직
        int lt=Arrays.stream(arr).max().getAsInt();
        int rt=Arrays.stream(arr).sum();
        int answer=0;
        while(lt <=rt){
            int mid=(lt+rt)/2;
            if(count(arr,mid)<=m){
                answer=mid;
                rt=mid-1;
            }else lt=mid+1;
        }
        System.out.println(answer);
    }
    public static int count(int[] arr,int capacity){
        int count =1;
        int sum=0;
        for(int i=0;i<arr.length;++i){
            if(sum+arr[i]<= capacity) {
                sum += arr[i];
            }else{
                count++;
                sum=arr[i];
            }
        }
        return count;
    }
}

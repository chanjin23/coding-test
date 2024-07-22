package inflearn.introduction.sortandsearch;

import java.util.*;
import java.io.*;
public class Sol0610SettingTable {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        //로직
        Arrays.sort(arr);

        int rt=arr[arr.length-1]-arr[0];
        /*int lt=Integer.MAX_VALUE;
        for(int i=1;i<n;++i){
            int tmp=arr[i-1]-arr[i];
            lt=Math.min(tmp,lt);
        }*/ //이런식으로하면 더오래걸리니까 알고리즘 복잡도가 logN이므로 lt를 1로 설정
        int lt=1;

        int answer=0;
        while(lt<=rt){
            int mid=(rt+lt)/2;
            if(horse(arr,mid) >=c){
                answer=mid;
                lt=mid+1;
            }else rt=mid-1;
        }
        System.out.println(answer);
    }
    public static int horse(int[] arr, int distance){
        int point =arr[0];
        int horseCnt=1;
        for(int i=1;i<arr.length;++i){
            if(arr[i]-point>= distance){
                point=arr[i];
                horseCnt++;
            }
        }
        return horseCnt;
    }
}

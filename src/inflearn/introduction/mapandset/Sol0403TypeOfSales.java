package inflearn.introduction.mapandset;

import java.util.*;
import java.io.*;
public class Sol0403TypeOfSales {
    public static void main(String[] args) throws Exception{
        //입력
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] arr=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        //로직
        for(int i=0;i<k;++i){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int size = map.size();
        System.out.print(size+" ");
        for(int i=k;i<n;++i){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            map.put(arr[i-k],map.get(arr[i-k])-1);
            if(map.get(arr[i-k])==0) {
                map.remove(arr[i-k]);
            }
            System.out.print(map.size()+" ");

        }
    }
}

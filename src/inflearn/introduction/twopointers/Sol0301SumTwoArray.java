package inflearn.introduction.twopointers;

import java.util.*;
import java.io.*;
public class Sol0301SumTwoArray {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        for(int i=0;i<n;++i){
            arr1[i]=Integer.parseInt(st.nextToken());
        }
        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        int[] arr2 = new int[m];
        for(int i=0;i<m;++i){
            arr2[i]=Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> list =new ArrayList<>();

        int p1=0;
        int p2=0;
        while (n > p1 && m > p2) {
            if(arr1[p1] >=arr2[p2]){
                list.add(arr2[p2++]);
            }else{
                list.add(arr1[p1++]);
            }
        }
        //돌지 않은 나머지를 순회한다.
        while(n>p1) list.add(arr1[p1++]);
        while(m>p2) list.add(arr2[p2++]);

        for(int i :list){
            System.out.print(i+" ");
        }
    }
}

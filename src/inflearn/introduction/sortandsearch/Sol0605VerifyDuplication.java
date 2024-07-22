package inflearn.introduction.sortandsearch;

import java.util.*;
import java.io.*;
public class Sol0605VerifyDuplication {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        //로직
//        Arrays.sort(arr);
//        for(int i=0;i<n-1;++i){
//            if(arr[i]==arr[i+1]){
//                System.out.println("D");
//                return;
//            }
//        }
//        System.out.println("U");
        //로직2
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;++i){
            if(map.containsKey(arr[i])) {
                System.out.println("D");
                return;
            }
            map.put(arr[i],0);
        }
        System.out.println("U");
    }
}

package inflearn.introduction.twopointers;

import java.io.*;
import java.util.*;



public class Sol0302GetCommonElement {
//    public static void main(String[] args) throws Exception{
//        //입력
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int n=Integer.parseInt(br.readLine());
//        StringTokenizer st=new StringTokenizer(br.readLine());
//        HashSet<Integer> set1=new HashSet<>();
//        for(int i=0;i<n;++i){
//            set1.add(Integer.parseInt(st.nextToken()));
//        }
//        int m=Integer.parseInt(br.readLine());
//        st=new StringTokenizer(br.readLine());
//
//        HashSet<Integer> set2=new HashSet<>();
//        for(int i=0;i<m;++i){
//            set2.add(Integer.parseInt(st.nextToken()));
//        }
//        //로직
//        set1.retainAll(set2);
//        ArrayList<Integer> list =new ArrayList<>(set1);
//        Collections.sort(list);
//        for (Integer i : list) {
//            System.out.print(i+" ");
//        }
//    }

    public static void main(String[] args) throws IOException{
        //입력
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        for(int i=0;i<n;++i){
            arr1[i]=(Integer.parseInt(st.nextToken()));
        }
        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());

        int[] arr2 = new int[n];
        for(int i=0;i<m;++i){
            arr2[i]=(Integer.parseInt(st.nextToken()));
        }
        //로직
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1=0;
        int p2=0;
        ArrayList<Integer> list =new ArrayList<>();
        while(n >p1&& m >p2){
            if(arr1[p1] ==arr2[p2]){
                list.add(arr1[p1++]);
                p2++;
            }else if(arr1[p1] <arr2[p2]){
                p1++;
            }else{
                p2++;
            }
        }
        Iterator<Integer> iter=list.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }

    }
}

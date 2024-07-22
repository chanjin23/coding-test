package inflearn.introduction.sortandsearch;

import java.util.*;
import java.io.*;
public class Sol0604LeastRecentlyUsed{
//    public static void main(String[] args) throws Exception{
//        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st=new StringTokenizer(br.readLine());
//        int s=Integer.parseInt(st.nextToken());
//        int n=Integer.parseInt(st.nextToken());
//
//        st=new StringTokenizer(br.readLine());
//        int[] arr =new int[n];
//        for(int i=0;i<n;++i){
//            arr[i]=Integer.parseInt(st.nextToken());
//        }
//
//        Queue<Integer> queue =new LinkedList<>();
//        for(int i=0;i<s;++i){
//            queue.offer(0);
//        }
//
//        for(int i=0;i<n;++i){
//            if(!queue.contains(arr[i])){
//                queue.offer(arr[i]);
//                queue.poll();
//            }else{
//                int tmp2=0;
//                for(int j=0;j<s;++j){
//                    int tmp=queue.poll();
//                    if(tmp!=arr[i]){
//                        queue.offer(tmp);
//                    }else{
//                        tmp2=tmp;
//                    }
//                }
//                if(queue.size()==s-1) queue.offer(tmp2);
//            }
//        }
//
//        int[] arr2=new int[s];
//        for(int i=s-1;i>=0;--i){
//            arr2[i] = queue.poll();
//        }
//        for(int i=0;i<s;++i){
//            System.out.print(arr2[i]+" ");
//        }
//    }

    //가변 배열 문제
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int s=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        int[] arr =new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int[] cache=new int[s];
        for(int i=0;i<n;++i){
            int pos=-1;
            for(int j=0;j<s;++j){
                if(cache[j]==arr[i]){
                    pos=j;
                    break;
                }
            }
            //탐색되지 않았으므로 push
            if(pos==-1){
                for(int k=s-1;k>=1;--k){   //한칸씩 옆으로 민다.
                    cache[k]=cache[k-1];
                }
            }else{
                for(int k=pos;k>=1;--k){
                    cache[k]=cache[k-1];
                }
            }
            cache[0]=arr[i];
        }
        for(int i=0;i<s;++i){
            System.out.print(cache[i]+" ");
        }
    }
}

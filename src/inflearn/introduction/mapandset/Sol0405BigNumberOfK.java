package inflearn.introduction.mapandset;

import java.util.*;
import java.io.*;
public class Sol0405BigNumberOfK {
    public static void main(String[] args) throws IOException{
        //입력
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        //로직
        TreeSet<Integer> set=new TreeSet<>(Collections.reverseOrder());   //중복 제거, 정렬
        //default는 오름차순정렬
        //블랙트리구조
        //Tset.remove(143);
        //System.out.println(set.size());
        //System.out.println("first : "+ set.first());
        //System.out.println("last : "+ set.last());
        //TreeSet들의 다양한 메서드
        for(int i=0;i<n;++i){
            for(int j=i+1;j<n;++j){
                for(int l=j+1;l<n;++l){
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int tmp=1;
        for(int i:set){
            if(tmp==k) {
                System.out.print(i);
                return;
            }
            tmp++;
        }
        System.out.print("-1");
    }
}

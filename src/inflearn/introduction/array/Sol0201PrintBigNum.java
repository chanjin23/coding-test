package inflearn.introduction.array;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Sol0201PrintBigNum {
//    public static void main(String[] args) throws Exception{
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int n=Integer.parseInt(br.readLine());
//        StringTokenizer st=new StringTokenizer(br.readLine());
//        int[] num = new int[n];
//        int max =-1;
//        for(int i=0;i<n;++i){
//            num[i] = Integer.parseInt(st.nextToken());
//        }
//        System.out.print(num[0]+" ");
//        for(int i=1;i<n;++i){
//            if(num[i-1]<num[i]){
//                System.out.print(num[i]+" ");
//            }
//        }
//    }

    //프로그래머스 방식대로 풀어보기
    public ArrayList<Integer> solution(int n,int[] arr){
        ArrayList<Integer> answer =new ArrayList<>();
        answer.add(arr[0]);  //첫 번째는 출력
        for(int i=1;i<n;++i){
            if(arr[i-1]<arr[i]) answer.add(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Sol0201PrintBigNum T =new Sol0201PrintBigNum();
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        for(int x: T.solution(n,arr)){
            System.out.print(x+" ");
        }
    }
}

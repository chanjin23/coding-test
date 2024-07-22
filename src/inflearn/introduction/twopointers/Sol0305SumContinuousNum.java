package inflearn.introduction.twopointers;

import java.util.Scanner;

public class Sol0305SumContinuousNum {
//    public static void main(String[] args) {
//        //입력
//        Scanner sc =new Scanner(System.in);
//        int n = sc.nextInt();
//
//        //로직
//        int len =n/2+1;
//        int[] arr =new int[len];
//        for(int i=0;i<len;++i){
//            arr[i]=i+1;
//        }
//        int right =0;
//        int left=0;
//        int sum=0;
//        int answer =0;
//
//        for(;right<len;++right){
//            sum+=arr[right];
//            while(sum >n){
//                sum-=arr[left++];
//            }
//            if(sum==n) answer++;
//        }
//
//        System.out.println(answer);
//    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int count =1;
        n--;
        int answer =0;
        while(n>0){
            count++;
            n=n-count;
            if(n%count==0) answer++;
        }
        System.out.println(answer);

    }
}

package inflearn.introduction.sortandsearch;

import java.util.Arrays;
import java.util.Scanner;

public class Sol0606Mischief {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
            arr2[i]=arr[i];
        }

        //로직
        Arrays.sort(arr);
        int tmp=0;
        int[] index=new int[2];
        for(int i=0;i<n;++i){
            if(arr[i]!=arr2[i]){
                index[tmp++]=i+1;
            }
        }
        System.out.println(index[0]+" "+index[1]);

    }
}

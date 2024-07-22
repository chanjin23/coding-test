package inflearn.introduction.sortandsearch;

import java.util.*;


public class Sol0608BinarySearch {
    /*static int n;
    static int left;
    static int right;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int m=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }

        //로직
        Arrays.sort(arr);
        left=0;
        right=n-1;
        int idx=(right-left)/2;
        int answer=binarySearch(idx,arr,m);
        System.out.println(answer+1);
    }
    public static int binarySearch(int idx,int[] arr,int m){
        while(arr[idx]!=m){
            if(arr[idx]>m){
                idx=(idx+left)/2;
                binarySearch(idx,arr,m);
            }else if(arr[idx]<m){
                idx=(right+idx)/2;
                binarySearch(idx,arr,m);
            }
        }
        return idx;
    }*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[] arr =new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }

        //로직
        Arrays.sort(arr);
        int lt=0;
        int rt=n-1;
        int mid=0;
        while(lt <=rt){
            mid=(lt+rt)/2;
            if(arr[mid]==m){
                System.out.println(mid + 1);
                return;
            }else if(arr[mid]> m){
                rt=mid-1;
            }else{
                lt=mid+1;
            }
        }
    }
}

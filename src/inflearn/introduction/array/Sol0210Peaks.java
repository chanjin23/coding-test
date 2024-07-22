package inflearn.introduction.array;

import java.util.*;
import java.io.*;
public class Sol0210Peaks {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//        int n=Integer.parseInt(br.readLine());
//        int[][] array=new int[n+2][n+2];
//        int len =array.length;
//        for(int i=1;i<=len-2;i++){
//            StringTokenizer st=new StringTokenizer(br.readLine());
//            for(int j=1;j<=len-2;j++){
//                array[i][j] =Integer.parseInt(st.nextToken());
//            }
//        }
//        int count =0;
//        for(int i=1;i<=len-2;++i){
//            for(int j=1;j<=len-2;j++){
//                int tmp =array[i][j];
//                if(tmp>array[i][j+1]&&tmp>array[i][j-1]&&tmp>array[i+1][j]&&tmp>array[i-1][j]) count++;
//            }
//        }
//        System.out.println(count);
//    }
    //리팩토링
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr=new int[n][n];
        //입력
        for(int i=0;i<n;++i){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;++j){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        //          동, 남, 서, 북
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int count =0;
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                //동서남북 비교하기
                boolean flag =true;
                for(int k=0;k<4;++k){
                    int nj=j+dx[k];
                    int ni=i+dy[k];
                    //값이 더작으면 false로 반환
                    if (nj >= 0 && nj < n && ni >= 0 && ni < n && arr[i][j] <= arr[ni][nj]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) count++;
            }
        }
        System.out.println(count);
    }
}

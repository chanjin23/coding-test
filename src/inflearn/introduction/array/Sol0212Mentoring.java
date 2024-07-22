package inflearn.introduction.array;

import java.util.*;
import java.io.*;
public class Sol0212Mentoring {
        public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][n];
        //입력
        for(int i=0;i<m;++i){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;++j){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int answer=0;
        //로직
        for(int i=1;i<=n;++i){  //멘토 학생 이름
            for(int j=1;j<=n;++j){  //멘티 학생 이름
                int count =0;
                for(int k=0;k<m;++k){ //행
                    int pi=0;
                    int pj=0;
                    for(int s=0;s<n;++s){   //열
                        if(arr[k][s]==i) pi=s;  //현재 위치에 멘토가 있으면 해당 순위(s) 저장
                        if(arr[k][s]==j) pj=s;  //현재 위치에 멘티가 있으면 해당 순위(s) 저장
                    } //학생들을 찾는다.
                    if(pi<pj) count++;  //멘토 순위가 더 높으면 카운트
                }
                //행마다 멘토 멘티 조건을 만족하면 answer++
                if(m==count) answer++;
            }
        }
        System.out.println(answer);
    }

}
package inflearn.introduction.array;

import java.util.*;
import java.io.*;

public class Sol0211TemporaryLeader {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] student = new int[n][5];    //[학생][학년]
        for(int i=0;i<n;++i){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<5;++j){
                student[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int max=-1;
        int answer=0;
        for(int i=0;i<n;++i){
            int count =0;
            for(int j=0;j<n;++j){
                if(i!=j){
                    for(int k=0;k<5;++k){
                        if(student[i][k]==student[j][k]){
                            ++count;
                            break;
                        }
                    }
                }
            }
            if(max<count){
                max=count;
                answer=i+1;
            }
        }

        System.out.println(answer);
    }
}

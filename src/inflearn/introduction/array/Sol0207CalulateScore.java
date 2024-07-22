package inflearn.introduction.array;

import java.util.*;
import java.io.*;

public class Sol0207CalulateScore {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st =new StringTokenizer(br.readLine());
        int count =0;
        int total=0;
        for(int i=0;i<n;++i){
            int score=Integer.parseInt(st.nextToken());
            if(score==1){
                count++;
                total+=count;
            }else if(score==0){
                count =0;
            }
        }
        System.out.println(total);

    }
}

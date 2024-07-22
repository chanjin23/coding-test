package inflearn.introduction.array;

import java.util.*;
import java.io.*;
public class Sol0202VisibleStudent {
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st =new StringTokenizer(br.readLine());
        int max=-1;
        int count =0;
        for(int i=0;i<n;++i){
            int student =Integer.parseInt(st.nextToken());
            if(max <student){
                count++;
                max=student;
            }
        }
        System.out.println(count);
    }
}

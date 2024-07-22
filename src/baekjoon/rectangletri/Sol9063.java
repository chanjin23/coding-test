package baekjoon.rectangletri;
import java.util.*;
import java.io.*;
public class Sol9063 {
        public static void main(String[] args) throws IOException{
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            long n =Long.parseLong(br.readLine());
            StringTokenizer st;
            long minX=100001;
            long maxX=-100001;
            long minY=100001;
            long maxY=-100001;
            for(int i=0;i<n;++i){
                st=new StringTokenizer(br.readLine());
                if(n==1){
                    System.out.println("0");
                    System.exit(0);
                }
                long x=Long.parseLong(st.nextToken());
                long y=Long.parseLong(st.nextToken());
                if(minX >x){
                    minX =x;
                }
                if(maxX <x){
                    maxX=x;
                }
                if(minY >y){
                    minY =y;
                }
                if(maxY <y){
                    maxY=y;
                }
            }
            System.out.println((maxX-minX)*(maxY-minY));
        }
}

package inflearn.introduction.sortandsearch;

import java.io.*;
import java.util.*;
public class Sol0607PointSort {
    public static class Point implements Comparable<Point>{
        int x;
        int y;
        public Point(int x, int y){
            this.x=x;
            this.y=y;
        }

        @Override
        public int compareTo(Point o){
            if(x==o.x) return this.y-o.y;
            else return this.x-o.x;
        }

    }
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Point[] arr=new Point[n];
        for(int i=0;i<n;++i){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i]=new Point(x,y);
        }
        Arrays.sort(arr);
        for(int i=0;i<n;++i){
            System.out.println(arr[i].x + " " + arr[i].y);
        }

    }
}

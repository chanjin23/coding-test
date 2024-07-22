package inflearn.introduction.stackqueue;

import java.util.*;
import java.io.*;

public class Sol0508EmergencyRoom {
    public static class Patient{
        int index=0;
        int risk=0;
        public Patient(int index, int risk){
            this.index= index;
            this.risk = risk;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine()," ");
        int[] arr=new int[n];
        Queue<Patient> queue=new LinkedList<>();
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
            queue.offer(new Patient(i,arr[i]));
        }
        int answer=0;
        while(!queue.isEmpty()){
            Patient tmp=queue.poll();
            boolean flag=true;
            for(Patient p: queue){
                if(tmp.risk<p.risk){
                    queue.offer(tmp);
                    flag=false;
                    break;
                }
            }
            if(flag){
                answer++;
                if(tmp.index==m){
                    System.out.println(answer);
                    return;
                }
            }
        }
    }
}

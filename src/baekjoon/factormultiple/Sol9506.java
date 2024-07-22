package baekjoon.factormultiple;

import java.io.*;

public class Sol9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while(true){
            int[] tmp = new int[100000];
            int sum = 0;

            int n =Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            int j=0;
            for(int i=1;i<n;++i){

                if(n%i==0){
                    sum += i;
                    tmp[j]=i;
                    j++;
                }
            }
            if(sum==n){
                bw.write(String.valueOf(n) + " = ");
                for(int i=0;i<j;++i){
                    String s=String.valueOf(tmp[i]);
                    bw.write(s);
                    if(i+1!=j){
                        bw.write(" + ");
                    }
                }
            }else{
                bw.write(String.valueOf(n) + " is NOT perfect.");
            }
            bw.newLine();
        }//while
        bw.flush();
        bw.close();
    }
}


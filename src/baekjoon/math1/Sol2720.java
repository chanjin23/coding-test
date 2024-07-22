package baekjoon.math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sol2720 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());

        for(int i=0;i<n;++i){
            int price =Integer.parseInt(br.readLine());
            int quarter = 0, dime = 0, nickel = 0, penny = 0;
            while (price > 0) {
                if (price - 25 >= 0) {
                    price-=25;
                    quarter++;
                }else if(price-10>=0){
                    price-=10;
                    dime++;
                }else if(price-5>=0){
                    price-=5;
                    nickel++;
                }else if(price-1>=0){
                    price-=1;
                    penny++;
                }else{
                    break;
                }
            }
            bw.write(String.valueOf(quarter) + " " + String.valueOf(dime) + " " + String.valueOf(nickel) + " " + String.valueOf(penny) + " ");
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();

    }
}

package baekjoon.rectangletri;
import java.io.*;
import java.util.*;
public class Sol5073 {
        public static void main(String[] args)throws Exception{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            while(true){
                st=new StringTokenizer(br.readLine());
                int[] input =new int[3];
                input[0]=Integer.parseInt(st.nextToken());
                input[1]=Integer.parseInt(st.nextToken());
                input[2]=Integer.parseInt(st.nextToken());

                if(input[0]==0&&input[1]==0&&input[2]==0){
                    break;
                }
                boolean flag =true;
                Arrays.sort(input);
                //정렬을 통해서 가장 큰 값 확인
                if(input[2]>= input[0]+input[1]){
                    System.out.println("Invalid");
                    continue;
                }
                if(input[0] ==input[1]&&input[1]==input[2]) System.out.println("Equilateral");
                else if(input[0]==input[1]||input[0]==input[2]||input[1]==input[2])
                    System.out.println("Isosceles");
                else System.out.println("Scalene");


            }
        }

}

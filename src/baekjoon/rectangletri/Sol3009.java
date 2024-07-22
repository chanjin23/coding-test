package baekjoon.rectangletri;
import java.util.*;

public class Sol3009 {
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            int[][] dot =new int[3][2];
            int x=0;
            int y=0;
            for(int i=0;i<3;++i){
                dot[i][0] =sc.nextInt();
                dot[i][1] =sc.nextInt();
            }
            if(dot[0][0]== dot[1][0])
                x=dot[2][0];
            else if(dot[1][0]== dot[2][0])
                x=dot[0][0];
            else
                x=dot[1][0];

            if(dot[0][1]== dot[1][1])
                y=dot[2][1];
            else if(dot[1][1]== dot[2][1])
                y=dot[0][1];
            else
                y=dot[1][1];

            System.out.println(x+" "+y);

        }
}

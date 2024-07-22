package baekjoon.rectangletri;
import java.util.*;

public class Sol1085 {
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            int w=sc.nextInt();
            int h=sc.nextInt();
            int minx=0;
            int miny=0;
            if(x >=w-x){
                minx=w-x;
            }else{
                minx=x;
            }
            if(y >=h-y){
                miny=h-y;
            }else{
                miny=y;
            }
            if(minx>=miny){
                System.out.println(miny);
            }else{
                System.out.println(minx);
            }
        }
}

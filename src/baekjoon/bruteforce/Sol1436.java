package baekjoon.bruteforce;
import java.util.*;

public class Sol1436 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int i=666;
        int count =0;
        while(true){
            String trans=String.valueOf(i);
            for(int j=0;j<trans.length()-2;++j){
                if(trans.charAt(j)=='6'&&trans.charAt(j+1)=='6'&&trans.charAt(j+2)=='6'){
                    count++;
                    break;
                }
            }
            if(count==n) {
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}

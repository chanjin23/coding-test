package programmers.lv1;
import java.util.*;

public class ReverseThreeFormation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        String n3="";
        while(n>0){
            n3+=n%3;
            n/=3;
        }
        int total =0;
        //반대로 들어감

        for(int i=0;i<n3.length();++i){
            total+=Math.pow(3,n3.length()-i-1)*Integer.parseInt(n3.substring(i,i+1));
        }
        int answer = total;
        System.out.println(answer);
    }
}

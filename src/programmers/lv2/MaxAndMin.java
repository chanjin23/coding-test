package programmers.lv2;

public class MaxAndMin {
    public static void main(String[] args) {
        String s = "1 2 3 4";

        String answer = "";
        //split
        String[] sInt =s.split(" ");
        int small=Integer.parseInt(sInt[0]);
        int large=Integer.parseInt(sInt[0]);

        for(int i=1;i<sInt.length;++i){
            int x=Integer.parseInt(sInt[i]);
            if(small>x){
                small=x;
                continue;
            }
            if(large<x){
                large =x;
            }
        }
        answer=String.valueOf(small)+" "+String.valueOf(large);

        System.out.println("answer = " + answer);
    }
}

package programmers.lv1;

public class Coke {
    public static void main(String[] args) {
        int a=2;
        int b=1;
        int n=20;
        int answer = 0;
        while(n>0){
            answer+=(n/a)*b;
            n=(n/a)*b+(n%a);
            if(n <a) break;
        }
        System.out.println(answer);
    }
}

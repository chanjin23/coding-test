package programmers.lv1;

public class CalculateAmount {
    public static void main(String[] args) {
        int price =3;
        int money =20;
        int count =4;
        //price 놀이기구 이용료, money 처음가지고있는 금액, count 놀이기구 이용횟수
        long answer = -1;
        //for문으로 계속 반복
        long tmp =money;
        for(int i=1;i<=count;++i){
            tmp-=price*i;
        }
        if(tmp>=0){
            System.out.println("answer = 0");
            System.exit(0);
        }
        answer=-tmp;

        System.out.println("answer = " + answer);
    }
}

package programmers.lv1;

public class AdditionOfDivisors {
    public static void main(String[] args) {
        //약수의 개수와 덧셈
        int left = 13;
        int right = 17;
        //left와 right 사이의 수로부터 각각의 약수의 개수를 구하고
        //약수의 개수가 짝수면 + 홀수면 -
        //for문을 이용
        int sum=0;
        for(int i=left;i<=right;++i){
            int temp=0;
            for(int j=1;j<=i;++j){
                //약수의 개수 구하기
                if(i%j==0){
                    ++temp;
                }
            }
            if(temp%2==0){
                sum+=i;
            }else{
                sum-=i;
            }
        }
        System.out.println("sum = " + sum);
    }
}

package programmers.lv1;

public class SumNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int answer = -1;
        //0~9까지 더하는거니까
        int total =0;
        for(int i=0;i<10;++i){
            total+=i;
        }
        int totalNumbers=0;
        for(int i=0;i<numbers.length;++i){
            totalNumbers+=numbers[i];
        }
        answer=total-totalNumbers;
        System.out.println("answer = " + answer);
    }
}

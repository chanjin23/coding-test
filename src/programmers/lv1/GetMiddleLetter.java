package programmers.lv1;

public class GetMiddleLetter {
    public static void main(String[] args) {
        //가운데 글자 가져오기
        String s = "abcde";
        String answer = "";
        //s가 짝수인경우 홀수인경우
        int len =s.length();
        if(len%2==1){
            answer =s.substring(len/2,len/2+1);
        }else{
            answer =s.substring(len/2-1,len/2+1);
        }
        System.out.println("answer = " + answer);
    }
}

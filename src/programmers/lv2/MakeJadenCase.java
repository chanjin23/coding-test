package programmers.lv2;

public class MakeJadenCase {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        String[] words=s.toLowerCase().split("");   //전부 자르기
        StringBuilder fastAnswer =new StringBuilder();

        boolean flag =true;

        for(String word:words){
            fastAnswer.append(flag ? word.toUpperCase() : word);
            flag =word.equals(" ") ? true : false;
        }
        System.out.println(fastAnswer.toString());
    }
}

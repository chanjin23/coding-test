package programmers.lv1;

public class CaesarCipherPassword {
    public static void main(String[] args) {
        String s = "AB";
        int n=1;
        String answer = "";
        for(int i=0;i<s.length();++i){
            if(Character.isLowerCase(s.charAt(i))){
                answer+=(char)((s.charAt(i)+n-'a')%26+'a');
            }else if(Character.isUpperCase(s.charAt(i))){
                answer+=(char)((s.charAt(i)+n-'A')%26+'A');
            }else{
                answer+=s.charAt(i);
            }
        }
        System.out.println(answer);
    }
}

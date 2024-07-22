package programmers.lv1;

public class BlindPhoneNumber {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        String answer = "";
        for(int i=0;i<phone_number.length();++i){
            if(phone_number.length()-4>i){
                answer +="*";
            }
        }
        answer+=phone_number.substring(phone_number.length()-4,phone_number.length());
        System.out.println("answer = " + answer);
    }
}

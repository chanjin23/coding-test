package programmers.lv1;

public class FindKimBySeoul {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Lee", "Kim"};
        String answer ="";
        int len =seoul.length;
        for(int i=0;i<len;++i){
            if(seoul[i].equals("Kim")){
                answer ="김서방은 " +i+"에 있다";
                break;
            }
        }
        System.out.println("answer = " + answer);
    }
}

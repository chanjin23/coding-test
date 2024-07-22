package programmers.lv1;

public class UseString {
    public static void main(String[] args) {
        String s = "a234";
        boolean answer = true;
        //try-catch로 하면 되자나
        if(s.length()==4||s.length()==6){
            try{
                int x = Integer.parseInt(s);
            }catch(Exception e){
                answer =false;
                System.out.println("answer = " + answer);
                System.exit(0);
            }
            System.out.println("answer = " + answer);
            System.exit(0);
        }
        else System.exit(0);
    }
}

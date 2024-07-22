package programmers.lv1;

public class FoodFightCompetition {
    public static void main(String[] args) {
        //푸드 파이트 대회
        int[] food = new int[]{1, 3, 4, 6};
        int[] one=new int[food.length];
        for(int i=0;i<food.length;++i){
            one[i]=food[i]/2;
        }
        String answer = "";
        for(int i=1;i<food.length;++i){
            int tmp=one[i];
            for(int j=0;j<tmp;++j){
                answer+=i;
            }
        }
        answer+="0";
        answer+=(new StringBuilder(answer).reverse().toString().substring(1,answer.length()));
        System.out.println(answer);
    }
}

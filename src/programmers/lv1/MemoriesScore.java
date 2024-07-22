package programmers.lv1;

import java.util.Arrays;

public class MemoriesScore {
    public static void main(String[] args) {
        MemoriesScore T = new MemoriesScore();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}};
        System.out.println(Arrays.toString(T.solution(name, yearning, photo)));
    }
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int len=name.length;
        Point[] arr=new Point[len];
        for(int i=0;i<len;++i){
            arr[i]=new Point(name[i],yearning[i]);
        }
        int[] answer = new int[photo.length];
        for(int i=0;i<photo.length;++i){
            for(int j=0;j<photo[i].length;++j){
                for(int k=0;k<arr.length;++k){
                    if(photo[i][j].equals(arr[k].name)){
                        answer[i]+=arr[k].score;
                    }
                }
            }
        }

        return answer;
    }
    public static class Point{
        String name;
        int score;
        public Point(String name,int score){
            this.name=name;
            this.score=score;
        }
    }
}

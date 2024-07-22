package programmers.lv1;

public class MinimumRectangle {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int large=-1;
        int small=-1;
        for(int i=0;i<sizes.length;++i){
            for(int j=0;j<sizes[0].length;++j){
                large=Math.max(large,sizes[i][j]);
            }
        }
        for(int i=0;i<sizes.length;++i){
            int tmp=Math.min(sizes[i][0],sizes[i][1]);
            small=Math.max(small,tmp);
        }
        System.out.println(large*small);
    }
}

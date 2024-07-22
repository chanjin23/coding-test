package programmers.lv1;

import java.util.Arrays;

public class WalkPark {
    public static void main(String[] args) {
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};

        //시작지점을 찾는다.
        int x=-1;
        int y=-1;
        int parkX = park[0].length();
        int parkY = park.length;
        for (int i = 0; i < park.length; ++i) {
            if(park[i].contains("S")){
                x = park[i].indexOf('S');
                y = i;
                break;
            }
        }

        for (int i = 0; i < routes.length; ++i) {
            String way[] = routes[i].split(" ");
            String vector =way[0];
            int distance = Integer.parseInt(way[1]);
            int currentX =x;
            int currentY =y;

            if (vector.equals("E")) {
                boolean flag =true;
                for(int j=1;j<=distance;++j){
                    currentX++;
                    if (currentX >= parkX) {
                        flag =false;
                        break;
                    } else if (park[currentY].charAt(currentX) =='X') {
                        flag =false;
                        break;
                    }
                }
                if(flag){
                    x = currentX;
                }
            }else if (vector.equals("W")) {
                boolean flag =true;
                for(int j=1;j<=distance;++j){
                    currentX--;
                    if (currentX < 0) {
                        flag =false;
                        break;
                    } else if (park[currentY].charAt(currentX) =='X') {
                        flag =false;
                        break;
                    }
                }
                if(flag){
                    x = currentX;
                }
            }else if (vector.equals("S")) {
                boolean flag =true;
                for(int j=1;j<=distance;++j){
                    currentY++;
                    if (currentY >= parkY) {
                        flag =false;
                        break;
                    } else if (park[currentY].charAt(currentX) =='X') {
                        flag =false;
                        break;
                    }
                }
                if(flag){
                    y = currentY;
                }
            }else if (vector.equals("N")) {
                boolean flag =true;
                for(int j=1;j<=distance;++j){
                    currentY--;
                    if (currentY < 0) {
                        flag =false;
                        break;
                    } else if (park[currentY].charAt(currentX) =='X') {
                        flag =false;
                        break;
                    }
                }
                if(flag){
                    y = currentY;
                }
            }
        }
        int[] answer =new int[2];
        answer[0]=y;
        answer[1]=x;
        System.out.println(Arrays.toString(answer));

    }
}

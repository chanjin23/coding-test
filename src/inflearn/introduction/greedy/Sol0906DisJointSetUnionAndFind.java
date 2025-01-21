package inflearn.introduction.greedy;

import java.util.*;
import java.io.*;

public class Sol0906DisJointSetUnionAndFind {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Point(x, y));
        }

        st = new StringTokenizer(br.readLine());
        int friend1 = Integer.parseInt(st.nextToken());
        int friend2 = Integer.parseInt(st.nextToken());

        arr[friend1] = 1;
        arr[friend2] = 2;

        for (int i=0; i < m; ++i) {
            boolean flag = false;
            for (int j = 0; j < m; ++j) {
                int student1 = list.get(j).x;
                int student2 = list.get(j).y;
                if (arr[student1] != 0 && arr[student2] != 0) {
//                    System.out.println("arr[student1] = " + arr[student1]);
//                    System.out.println("arr[student2] = " + arr[student2]);
                    if (arr[student1] != arr[student2]) {
                        //만난것
                        System.out.println("YES");
                        return;
                    }
                } else if (arr[student1] != 0) {
                    arr[student2] = arr[student1];
                } else if (arr[student2] != 0) {
                    arr[student1] = arr[student2];
                } else {
                    //둘다 0인경우
                    flag = true;
                }
//                System.out.println(Arrays.toString(arr));
            }
            if(!flag) break;
        }

        System.out.println("NO");
    }

    public static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

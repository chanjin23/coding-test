package inflearn.introduction.utilizingdfsbfs;

import java.io.*;
import java.util.*;


public class Sol0814PizzaDeliveryDistance {
    static int m,result=Integer.MAX_VALUE;
    static ArrayList<Point> home,pizza, pizzaStore;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        home = new ArrayList<>();
        pizza = new ArrayList<>();
        pizzaStore = new ArrayList<>();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    home.add(new Point(i, j));
                } else if (arr[i][j] == 2) {
                    pizza.add(new Point(i, j));
                }
            }
        }
        dfs(0, 0);
        System.out.println(result);
    }
    public static void dfs(int level,int idx) {
        if (level == m) {
            int tmp=0;
            for (int i = 0; i < home.size(); ++i) {
                int min=Integer.MAX_VALUE;
                for (int j = 0; j < pizzaStore.size(); ++j) {
                    int distance = Math.abs(home.get(i).x - pizzaStore.get(j).x)
                            + Math.abs(home.get(i).y - pizzaStore.get(j).y);
                    min = Math.min(min, distance);
                }
                tmp+=min;
            }
            result = Math.min(tmp, result);
            pizzaStore.clear();
        }else{
            for (int i = idx; i < pizza.size(); ++i) {
                pizzaStore.add(pizza.get(i));
                dfs(level + 1, i + 1);
            }
        }
    }
    public static class Point{
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

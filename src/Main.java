import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dfs(n);


    }
    public static void dfs(int n){
        if(n==0){
            return;
        }else{
            dfs(n-1);
            System.out.print(n);
        }
    }
}
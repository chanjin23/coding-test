package programmers.lv2;

public class JumpAndTeleport {
    public static void main(String[] args) {
        int n=5000;
        int ans = 0;

        while(n!=0){
            if(n%2==0){
                n/=2;
            }else{
                n--;
                ans++;
            }
        }

        System.out.println(ans);
    }
}

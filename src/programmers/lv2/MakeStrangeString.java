package programmers.lv2;

public class MakeStrangeString {
    public static void main(String[] args) {
        String s="try hello world";
        StringBuilder sb=new StringBuilder();
        while(true){
            String tmp=s.substring(0,s.indexOf(' '));
            for(int i=0;i<tmp.length();++i){
                if(i%2==0){
                    sb.append(Character.toUpperCase(tmp.charAt(i)));
                }else{
                    sb.append(Character.toLowerCase(tmp.charAt(i)));
                }
            }
            if(s.equals("")) break;
            s=s.substring(s.indexOf(' ')).trim();
        }

        System.out.println(sb);
    }
}

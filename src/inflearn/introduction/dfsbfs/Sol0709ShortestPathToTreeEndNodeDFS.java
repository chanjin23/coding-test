package inflearn.introduction.dfsbfs;

public class Sol0709ShortestPathToTreeEndNodeDFS {
    //아래 그림과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 구하라.
    //    1
    //  2    3
    // 4  5
    //출력: 1
    public static class Node{
        int data;
        Node lt,rt;
        public Node(int data){
            this.data =data;
            lt=rt=null;
        }
    }
    public static void main(String[] args) {
        Node root;
        root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        System.out.println(dfs(root,0));
    }
    public static int dfs(Node root,int level){
        if(root.lt==null&&root.rt==null) return level;
        else return Math.min(dfs(root.lt,level+1),dfs(root.rt,level+1));
    }
}

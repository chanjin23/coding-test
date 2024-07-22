package inflearn.introduction.dfsbfs;

public class Sol0705DepthFirstSearch {
    //DFS(깊이우선탐색
    //이진트리를 전위순회와 후위순회를 연습하라
    //      1
    //  2      3
    //4   5   6  7

    public static class Node{
        int data;
        Node lt,rt=null;
        public Node(int data){
            this.data=data;
            lt=rt=null;
        }
    }
    static Node root;
    public static void main(String[] args) {
        root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        root.rt.lt=new Node(6);
        root.rt.rt=new Node(7);

        dfs(root);
    }
    public static void dfs(Node root){
        if(root==null) return;
        else{
//            System.out.print(root.data+" ");    //전위 순회
            dfs(root.lt);
            System.out.print(root.data+" ");    //중위 순회
            dfs(root.rt);
//            System.out.print(root.data+" ");    //후위 순회
        }
    }
}

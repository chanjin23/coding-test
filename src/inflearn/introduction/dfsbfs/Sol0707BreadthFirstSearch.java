package inflearn.introduction.dfsbfs;

import java.util.*;
public class Sol0707BreadthFirstSearch {
    //아래 그림과 같이 이진트리를 레벨탐색 연습하세요.
    //    1
    // 2     3
    //4  5  6  7
    //output :  0: 1, 1: 2, 3 , 2: 4, 5, 6, 7
    public static class Node{
        int data;
        Node lt,rt =null;
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
        root.rt.lt=new Node(6);
        root.rt.rt=new Node(7);

        int level =0;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int len =q.size();
            System.out.print(level+": ");
            for(int i=0;i<len;++i){
                Node tmp =q.poll();
                System.out.print(tmp.data+" ");
                if(tmp.lt!=null) q.offer(tmp.lt);
                if(tmp.rt!=null) q.offer(tmp.rt);
            }
            System.out.println();
            level++;
        }
    }
}

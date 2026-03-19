package DataStructure.Tree.BinaryTreeDFS;
//this is for binary searchtree  DFS preorder traversal
class Node1{
    int data;
    Node left;
    Node right;
    Node1(int data){
        this.data=data;
        this.left=null;//it must be empty first afterwards we need to fill it
        this.right=null;
    }
}
public class preorderDFS {
    static Node createNode(int val){
        return new Node(val);
    }//this is for preorder traversal
    static void DFS(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        DFS(root.left);
        DFS(root.right);
    }
    public static void main(String[] args){
        preorderDFS bt=new preorderDFS();
        Node root=createNode(1);
        root.left=createNode(2);
        root.right=createNode(3);
        root.left.left=createNode(4);
        root.left.right=createNode(5);
        root.right.left=createNode(6);
        root.right.right=createNode(7);
        root.left.right.left=createNode(8);
        root.right.left.left=createNode(15);
        root.right.left.right=createNode(9);
        DFS(root);

        }
    }

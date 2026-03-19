
package DataStructure.Tree.BinaryTreeDFS;
//this is for binary searchtree  DFS preorder traversal
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;//it must be empty first afterwards we need to fill it
        this.right=null;
    }
}
public class InorderDFS {
    static Node createNode(int val){
        return new Node(val);
    }//this is for preorder traversal
    static void DFS(Node root){
        if(root==null){
            return;
        }
        DFS(root.left);
        System.out.print(root.data+" ");
        DFS(root.right);
    }
    public static void main(String[] args){
        InorderDFS bt=new InorderDFS();
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



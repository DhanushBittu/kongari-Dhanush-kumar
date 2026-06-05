package day12;

class NodeEx1 {
    int data;
    NodeEx left;
    NodeEx right;

    NodeEx1(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class SumOfBinaryTrees {

    static int idx = -1;

    public static NodeEx createTree(int[] arr) {
        idx++;

        if (idx >= arr.length || arr[idx] == -1) {
            return null;
        }

        NodeEx root = new NodeEx(arr[idx]);
        root.left = createTree(arr);
        root.right = createTree(arr);

        return root;
    }
    public void postorder(NodeEx root)
    {
        if(root==null)
        {
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.println(root.data+"->");
}
public int count(NodeEx root){
    if(root==null)
    {
        return 0;
    }
    return count(root.left)+count(root.right)+1;
    }
public int sum(NodeEx root){
    if(root==null)
    {
        return 0;
    }
    return sum(root.left)+sum(root.right)+root.data;
}
public static void main(String[] args) {

        int[] nodes = {90, 40, -1, -1, 50, -1, -1};

        NodeEx root = createTree(nodes);

        System.out.println(root.data);
        new PostOrder().postorder(root);
        System.out.println("Total number of nodes: " + new CountOfNodes().count(root));
        System.out.println("Sum of all nodes: " + new SumOfBinaryTrees().sum(root));

    }
}

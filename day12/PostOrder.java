package day12;

class NodeEx {
    int data;
    NodeEx left;
    NodeEx right;

    NodeEx(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class PostOrder {

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

    public static void main(String[] args) {

        int[] nodes = {90, 40, -1, -1, 50, -1, -1};

        NodeEx root = createTree(nodes);

        System.out.println(root.data);
        new PostOrder().postorder(root);
    }
}

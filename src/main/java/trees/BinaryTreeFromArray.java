package trees;

public class BinaryTreeFromArray {

    static Node root;
    //Function to construct binary tree from parent array.
    public static Node createTree(int arr[], int n)
    {
        root = null;

        Node[] created = new Node[n];

        for (int i = 0; i < n; i++)
            createNode(arr, i, created);

        return root;
    }

    public static void createNode(int arr[], int i, Node created[])
    {
        //base case if this node is already created.
        if (created[i] != null)
            return;

        //creating a new node and setting created[i].
        created[i] = new Node(i);

        //if 'i' is root, changing root pointer.
        if (arr[i] == -1)
        {
            root = created[i];
            return;
        }

        //if parent is not created then we create parent first.
        if (created[arr[i]] == null)
            createNode(arr, arr[i], created);

        //finding parent pointer.
        Node p = created[arr[i]];

        //if this is first child of parent, we store it as left child.
        if (p.left == null)
            p.left = created[i];
            //else we store it as right child.
        else
            p.right = created[i];
    }
}

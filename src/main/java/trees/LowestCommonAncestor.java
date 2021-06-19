package trees;

public class LowestCommonAncestor {

    public Node lca(Node root, int n1, int n2) {

        if(root==null)
            return null;

        if(root.key==n1 || root.key==n2)
            return root;

        Node l = lca(root.left,n1,n2);
        Node r = lca(root.right,n1,n2);

        if(l != null && r != null)
            return root;

        return(l!=null)?l:r;
    }
}

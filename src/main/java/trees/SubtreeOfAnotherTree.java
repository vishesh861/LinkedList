package trees;

public class SubtreeOfAnotherTree {

    public boolean isidentical(Node root, Node subroot){
        if (root == null && subroot == null) {
            return true;
        }

        if (root != null && subroot != null) {

            return root.key == subroot.key && isidentical(root.left, subroot.left) && isidentical(root.right, subroot.right);
        }
        return false;
    }
    public boolean subtree(Node root, Node subroot){
        if(root==null){
            return false;
        }

        if(root.key==subroot.key){
            if(isidentical(root, subroot)){
                return true;
            }
        }
        return subtree(root.left, subroot) || subtree(root.right, subroot);
    }
    public boolean isSubtree(Node root, Node subRoot) {
        return subtree(root, subRoot);
    }
}

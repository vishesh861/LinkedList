package BST;


public class Search {
//Time O(h)  space  O(h)
    public boolean search(Node node, int x) {

        if (node == null) {
            return false;
        } else if (node.key == x) {
            return true;
        } else if (node.key < x) {
            return search(node.right, x);
        } else {
            return search(node.left, x);
        }
    }
}

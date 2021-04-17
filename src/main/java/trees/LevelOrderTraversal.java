package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public ArrayList<Integer> lot(Node node) {
        ArrayList<Integer> res = new ArrayList<Integer>(0);

        //if node is null, we return the list.
        if (node == null)
            return res;

        //creating an empty queue for level order traversal.
        Queue<Node> q = new LinkedList<>();

        q.add(node);
        while (q.isEmpty() == false) {
            //storing front element of queue in list and removing it from queue.
            node = q.peek();
            res.add(node.key);
            q.poll();

            //storing the left child of the parent node in queue.
            if (node.left != null)
                q.add(node.left);

            //storing the right child of the parent node in queue.
            if (node.right != null)
                q.add(node.right);

        }
        //returning the list.
        return res;
    }
}

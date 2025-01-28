package BST;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestElementInBST {

    public int kthSmallest(Node root, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        // Queue for level-order traversal (BFS)
        Queue<Node> nq = new LinkedList<>();
        nq.add(root);

        while (!nq.isEmpty()) {
            Node temp = nq.poll();

            // Add the current node value to the min-heap
            q.add(temp.key);

            // Add left and right children to the traversal queue
            if (temp.left != null)
                nq.add(temp.left);
            if (temp.right != null)
                nq.add(temp.right);
        }

        // Poll k elements from the min-heap
        int ans = 0;
        while (k-- > 0) {
            ans = q.poll();
        }
        return ans;
    }

}

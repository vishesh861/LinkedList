package trees;

import java.util.LinkedList;

public class MakeBinaryTreeFromLinkedList {

    /*public void binary(Node head, Tree node) {

        Queue<Tree> q = new LinkedList<>();
        if (head == null) {
            node = null;
            return null;
        }

        node = new Tree(head.data);
        head = head.next;
        q.add(head.data);

        while (head != null) {

            Tree parent = q.poll();

            Tree leftNode = null; Tree rightNode = null;

            leftNode = new Tree(head.data);
            q.add(head.data);
            head = head.next;

            if (head != null) {
                rightNode = new Tree(head.data);
                q.add(head.data);
                head = head.next;
            }

            parent.left = leftNode;
            parent.right = rightNode;
        }

        return node;
    }*/
}

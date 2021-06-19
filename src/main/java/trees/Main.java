package trees;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 5, 5, 2, 2, -1, 3};
        BinaryTreeFromArray.createTree(arr, 7);

     /*   Node node = new Node(10);
        node.left = new Node(20);
        node.right = new Node(30);
        node.right.left = new Node(40);
        node.right.right = new Node(50);*/

       /* DiameterOfTree d = new DiameterOfTree();
        int a = d.diameter(node);
        System.out.println(a);*/

        /*Node node = new Node(10);
        node.left = new Node(2);
        node.right = new Node(-25);
        node.left.left = new Node(20);
        node.left.right = new Node(1);
        node.right.left = new Node(3);
        node.right.right = new Node(4);

        MaxPathSumFromAnyNode m = new MaxPathSumFromAnyNode();
        int a = m.max_path(node);
        System.out.println(a);*/

       /* CountSubTreeWithGivenSum c = new CountSubTreeWithGivenSum();
        int a = c.countSubTreeWithSum(node, 7);
        System.out.println(a);*/

       /* LevelOrderTraversal l = new LevelOrderTraversal();
        ArrayList<Integer> list = l.lot(node);
        System.out.println(list);*/

      /*LevelOrderTraversalSpiralForm l = new LevelOrderTraversalSpiralForm();
      ArrayList<Integer> list = l.spiral(node);
      for (Integer a : list) {
          System.out.print(a + " ");
      }*/

      /*MaximumWidthOfTree m = new MaximumWidthOfTree();
      int w = m.max_width(node);
        System.out.println(w);*/

/*      CheckBalancedOrNot c = new CheckBalancedOrNot();
      boolean b = c.isHeightBalanced(node);
        System.out.println(b);*/
/*
        RightViewOfBinaryTree l = new RightViewOfBinaryTree();
        ArrayList<Integer> list = l.rightView(node);
        System.out.println(list);*/

       /* LowestCommonAncestor l = new LowestCommonAncestor();
        l.lca(node, 20, 80);*/


    }
}

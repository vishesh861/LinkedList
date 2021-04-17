package trees;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

     /*   Node node = new Node(10);
        node.left = new Node(20);
        node.right = new Node(30);
        node.right.left = new Node(40);
        node.right.right = new Node(50);

        LevelOrderTraversal l = new LevelOrderTraversal();
        ArrayList<Integer> list = l.lot(node);
        System.out.println(list);*/

        String num1 = "498828660196";
        String num2 = "840477629533";
        Integer a = 0, b = 0, c = 0;
        for (int i=0; i<num1.length(); i++) {

            a = a * 10 + Character.getNumericValue(num1.charAt(i));
        }

        for (int i=0; i<num2.length(); i++) {

            b = b * 10 + Character.getNumericValue(num2.charAt(i));
        }

        c = a * b;

        System.out.println(c + "");

    }
}

package BST;

import java.util.Map;
import java.util.TreeMap;

public class VerticalSum {

    public void sum(Node node) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        vSum(map, node, 0);
        for (Map.Entry m :  map.entrySet()) {
            System.out.print(m.getValue() + " ");
        }
    }

    private void vSum(TreeMap<Integer, Integer> map, Node node, int i) {

        if (node == null) {
            return;
        }
        vSum(map, node.left, i-1);
        int pSum = (map.get(i) == null) ? 0 : map.get(i);
        map.put(i, pSum + node.key);
        vSum(map, node.right, i+1);

    }
}

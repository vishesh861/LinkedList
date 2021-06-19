package BST;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Pair1 {

    Node node;
    int hd;

    Pair1(Node n, int h) {
        node = n;
        hd = h;
    }
}
public class TopView {
    public ArrayList<Integer> top(Node root) {

        ArrayList<Integer> list = new ArrayList<>();

        Queue<Pair1> q = new LinkedList<>();

        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();

        q.add(new Pair1(root, 0));

        while (!q.isEmpty()) {

            Pair1 p = q.poll();
            Node n1 = p.node;
            int hd = p.hd;

            if (map.containsKey(hd)) {
                ArrayList<Integer> al = map.get(hd);
                al.add(n1.key);
                map.put(hd, al);
            } else {
                ArrayList<Integer> al = new ArrayList<Integer>();
                al.add(n1.key);
                map.put(hd, al);
            }


            if (n1.left != null) {
                q.add(new Pair1(n1.left, hd-1));
            }

            if (n1.right != null) {
                q.add(new Pair1(n1.right, hd+1));
            }
        }

        for (Map.Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
            ArrayList<Integer> a = m.getValue();
            list.add(a.get(0));

        }

        return list;
    }
}

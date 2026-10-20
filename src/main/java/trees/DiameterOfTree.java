package trees;

public class DiameterOfTree {

    int dia = 0;

    public int util(Node root)
    {

        if (root == null)
            return 0;

        int l = util(root.left);
        int r = util(root.right);

        if (l + r > dia)
            dia = l + r;

        return 1 + Math.max(l, r);
    }

    public int diameter(Node root)
    {
        util(root);
        return dia;
    }
}

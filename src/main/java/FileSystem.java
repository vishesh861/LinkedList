import java.util.*;
class FileSystem {
    private class Node {
        Map<String, Node> children = new HashMap<>();
        Integer value = null;
    }
    private Node root = new Node();

    public FileSystem() {
    }

    public boolean createPath(String path, int value) {
        String[] components = path.split("/");
        Node current = root;
        for (int i = 1; i < components.length; i++) {
            String component = components[i];
            if (!current.children.containsKey(component)) {
                if (i != components.length-1) {
                    return false;
                }
                Node newNode = new Node();
                current.children.put(component, newNode);
            }
            current = current.children.get(component);
        }
        // If we've reached this point, it means the path is created successfully
        if (current.value == null) {
            current.value = value;
            return true;
        } else {
            return false; // Path already exists with a value
        }

    }

    public int get(String path) {
        // Replace this placeholder return statement with your code
        String[] components = path.split("/");
        Node current = root;
        for (int i = 1; i < components.length; i++) {
            String component = components[i];
            if (current.children.containsKey(component)) {
                current = current.children.get(component);
            } else {
                return -1; // Path doesn't exist
            }
        }
        return current.value != null ? current.value : -1;
    }
}

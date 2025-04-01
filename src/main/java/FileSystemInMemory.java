import java.util.*;
public class FileSystemInMemory {
    private class Node {
        boolean isFile;
        String content;
        Map<String, Node> children;
        Node(boolean isFile) {
            this.isFile = isFile;
            this.content = "";
            this.children = new HashMap<>();
        }
    }
    private Node root;
    public FileSystemInMemory() {
        root = new Node(false);
    }
    public List <String> ls(String path) {
        Node node = findNode(path);
        if (node == null) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        if (node.isFile) {
            result.add(getFileName(path));
        } else {
            for (String child : node.children.keySet()) {
                result.add(child);
            }
            Collections.sort(result);
        }
        return result;
    }

    public void mkdir(String path) {
        String[] components = path.split("/");
        Node current = root;
        for (int i = 1; i < components.length; i++) {
            String component = components[i];
            if (!current.children.containsKey(component)) {
                current.children.put(component, new Node(false));
            }
            current = current.children.get(component);
        }
    }

    public void addContentToFile(String filePath, String content) {
        Node node = findNode(filePath);
        if (node == null) {
            mkdir(getDirPath(filePath));
            node = findNode(filePath);
            node.isFile = true;
        }
        node.content += content;
    }

    public String readContentFromFile(String filePath) {
        Node node = findNode(filePath);
        if (node == null || !node.isFile) {
            return "";
        }
        return node.content;
    }
    private Node findNode(String path) {
        String[] components = path.split("/");
        Node current = root;
        for (int i = 1; i < components.length; i++) {
            String component = components[i];
            if (!current.children.containsKey(component)) {
                return null;
            }
            current = current.children.get(component);
        }
        return current;
    }
    private String getFileName(String path) {
        return path.substring(path.lastIndexOf("/") + 1);
    }
    private String getDirPath(String path) {
        int extra = path.length() - path.lastIndexOf("/");
        return path.substring(0, path.lastIndexOf("/") + extra);
    }
}
package list;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

class NodeLruSynchronised {
    int key, value;
    NodeLruSynchronised next, pre;
    NodeLruSynchronised(int key, int value) {
        this.key = key;
        this.value = value;
        next = pre = null;
    }
}
class LRUCacheSynchronised {
    private final Map<Integer, NodeLruSynchronised> hsMap;
    private final int capacity;
    private int count;
    private final NodeLruSynchronised head;
    private final NodeLruSynchronised tail;
    private final ReentrantLock lock;
    // Constructor for initializing the cache capacity with the given value.
    LRUCacheSynchronised(int cap) {
        hsMap = new HashMap<>();
        this.capacity = cap;
        head = new NodeLruSynchronised(0, 0);
        tail = new NodeLruSynchronised(0, 0);
        head.next = tail;
        head.pre = null;
        tail.next = null;
        tail.pre = head;
        count = 0;
        lock = new ReentrantLock();
    }
    public void addToHead(NodeLruSynchronised node) {
        lock.lock();
        try {
            node.next = head.next;
            node.next.pre = node;
            node.pre = head;
            head.next = node;
        } finally {
            lock.unlock();
        }
    }
    // Function to delete a node.
    public void deleteNode(NodeLruSynchronised node) {
        lock.lock();
        try {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        } finally {
            lock.unlock();
        }
    }
    // Function to return value corresponding to the key.
    public int get(int key) {
        lock.lock();
        try {
            // if element is present in map,
            if (hsMap.get(key) != null) {
                NodeLruSynchronised node = hsMap.get(key);
                int result = node.value;
                deleteNode(node);
                addToHead(node);
                // returning the value.
                return result;
            }
            // else we return -1.
            return -1;
        } finally {
            lock.unlock();
        }
    }
    // Function for storing key-value pair.
    public void set(int key, int value) {
        lock.lock();
        try {
            if (hsMap.get(key) != null) {
                NodeLruSynchronised node = hsMap.get(key);
                node.value = value;
                deleteNode(node);
                addToHead(node);
            } else {
                NodeLruSynchronised node = new NodeLruSynchronised(key, value);
                hsMap.put(key, node);
                if (count < capacity) {
                    count++;
                    addToHead(node);
                } else {
                    hsMap.remove(tail.pre.key);
                    deleteNode(tail.pre);
                    addToHead(node);
                }
            }
        } finally {
            lock.unlock();
        }
    }
}



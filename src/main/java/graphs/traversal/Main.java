package graphs.traversal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // Undirected graph
    }

    public static void main(String[] args) {

        // Number of vertices in the graph
        int V = 5;

        // Adjacency list representation of the graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the graph
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 4);

        BreathFirstSearch breathFirstSearch = new BreathFirstSearch();
        breathFirstSearch.bfsOfGraph(V, adj);
    }

}

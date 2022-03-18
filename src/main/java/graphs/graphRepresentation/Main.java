package graphs.graphRepresentation;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        // Creating a graph with 5 vertices
        int V = 5;
        ArrayList<ArrayList<Integer>> adj
                = new ArrayList<ArrayList<Integer> >(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        // Adding edges one by one
        AdjacencyList.addEdge(adj, 0, 1);
        AdjacencyList.addEdge(adj, 0, 4);
        AdjacencyList.addEdge(adj, 1, 2);
        AdjacencyList.addEdge(adj, 1, 3);
        AdjacencyList.addEdge(adj, 1, 4);
        AdjacencyList.addEdge(adj, 2, 3);
        AdjacencyList.addEdge(adj, 3, 4);

        AdjacencyList.printGraph(adj);
    }
}

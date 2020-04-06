package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello from Caio");
        System.out.println("");

        Graph g = new Graph();
        g.addVertex("A");
        g.addVertex("B");
        // g.addVertex("C");
        // g.addVertex("D");
        // g.addVertex("E");
        // g.addVertex("F");
        // g.addVertex("G");
        g.addVertex("H");
        // g.addVertex("I");
        g.addEdge("A", "A", 0);
        g.addEdge("A", "B", 8);
        // g.addEdge("B", "H", 11);
        // g.addEdge("B", "C", 1);
        // g.addEdge("C", "D", 1);
        // g.addEdge("A", "D", 2);

        Edge e = g.getEdge("A", "B");
        System.out.println("from: " + e.from.name);
        System.out.println("to: " + e.to.name);
        System.out.println("weight: " + e.weight);

        // Vertex a = g.getVertex("A");
        // Vertex b = g.getVertex("B");
        // a.adjlist.forEach(b -> {
        // System.out.println("from: " + b.from.name);
        // System.out.println("to: " + b.to.name);
        // System.out.println("weight: " + b.weight);
        // System.out.println();
        // });
        // System.out.println("-----------------------------------");
        // b.adjlist.forEach(c -> {
        // System.out.println("name: " + c.from.name);
        // System.out.println("to: " + c.to.name);
        // System.out.println("weight: " + c.weight);
        // System.out.println();
        // });

    }
}
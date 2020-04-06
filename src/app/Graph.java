package app;

import java.util.ArrayList;

public class Graph {
    public ArrayList<Vertex> vlist;

    // Graph( ): This constructor creates a new object vlist (allocates memory to
    // it).
    public Graph() {
        this.vlist = new ArrayList<Vertex>();
    }

    // addVertex(v): This method creates a new vertex (using the constructor Vertex)
    // named ‘v’ and appends it to the list of vertices (vlist).
    public void addVertex(String name) {
        this.vlist.add(new Vertex(name));
    }

    // getVertex(v): This methods performs a linear search on vlist. If an element
    // with a name equal to ‘v’ is found, the element (a vertex) is returned. If no
    // vertex with name equal to ‘v’ is found in the list, NULL is returned.
    public Vertex getVertex(String name) {
        for (Vertex vertex : this.vlist) {
            if (vertex.name == name) {
                return vertex;
            }
        }
        return null;
    }

    // addEdge(v1, v2, weight): This method uses the method getVertex() to obtain
    // the vertices identified by the names v1 and v2. Next, it uses the constructor
    // Edge to create the new edge and adds it to the corresponding adjacency list.
    // If vertices v1 and v2 are different, a second edge originating at v2 and
    // ending at v1 must be added as well.
    public void addEdge(String from, String to, int weight) {
        Vertex _f = this.getVertex(from);
        Vertex _t = this.getVertex(to);

        _f.adjlist.add(new Edge(_f, _t, weight));

        if (_f.name != _t.name) {
            _t.adjlist.add(new Edge(_t, _f, weight));
        }

    }

    // getEdge(v1,v2): This method uses the method getVertex() to obtain the
    // vertices identified by the names v1 and v2. Next, it performs a linear search
    // on
    // the corresponding adjacency list to check whether the edge exists. If so, it
    // returns it. Otherwise, it returns NULL

    // maybe finished ??
    public Edge getEdge(String from, String to) {
        Vertex _f = this.getVertex(from);
        Vertex _t = this.getVertex(to);
        // need to loop through both vertexes ?
        for (Edge edge : _f.adjlist) {
            if (edge.from == _f && edge.to == _t)
                return edge;
        }

        for (Edge edge : _t.adjlist) {
            if (edge.from == _f && edge.to == _t)
                return edge;
        }

        return null;
    }

    // This method returns a graph, corresponding to the minimum spanning
    // tree of the original graph. You can use Prim or Kruskal algorithms to solve
    // this problem. Bear in mind that Kruskal requires you to implement a
    // disjoint-set data structure as well.
    // not finished
    public Graph MST() {

        return null;
    }

    // This method returns the cost of the minimum spanning tree
    // not finished
    public int MSTCost() {
        return -1;
    }

    // This method returns a graph containing the route (sequence of
    // vertices) of the shortest path from v1 to v2
    // not finished
    public Graph SP(String from, String to) {
        return null;
    }

    // This method returns the cost of the shortest path between v1 and v2
    // not finished
    public int SPCost(String from, String to) {
        return 0;
    }
}

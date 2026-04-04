// https://exercism.org/tracks/java/exercises/dot-dsl

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private final Map<String, String> attributes;
    private final Map<String, Node> nodes;
    private final List<Edge> edges;

    public Graph() {
        this.attributes = new HashMap<>();
        this.nodes = new LinkedHashMap<>();
        this.edges = new ArrayList<>();
    }

    public Graph(Map<String, String> attributes) {
        this();
        this.attributes.putAll(attributes);
    }

    public Collection<Node> getNodes() {
        return Collections.unmodifiableCollection(nodes.values());
    }

    public Collection<Edge> getEdges() {
        return Collections.unmodifiableCollection(edges);
    }

    public Graph node(String name) {
        nodes.putIfAbsent(name, new Node(name));
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        nodes.put(name, new Node(name, attributes));
        return this;
    }

    public Graph edge(String start, String end) {
        edges.add(new Edge(start, end));
        return this;
    }

    public Graph edge(
        String start,
        String end,
        Map<String, String> attributes
    ) {
        edges.add(new Edge(start, end, attributes));
        return this;
    }

    public Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(attributes);
    }
}

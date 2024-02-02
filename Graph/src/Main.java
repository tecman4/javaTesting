public class Main {
    public static void main(String[] args) {
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("C");
        graph.addEdge("A","B");
        graph.addNode("B");
        graph.addEdge("B","A");
        graph.addEdge("B","D");
        graph.removeEdge("B");
        graph.print();
    }
}
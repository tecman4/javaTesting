import java.util.HashMap;

public class Graph {
    private String label;
    private HashMap<String, Node> children = new HashMap<>();

    public void addNode(String label){
        children.put(label, new Node(label));
    }
    public void addEdge(String from, String to){
        children.put(from, new Node(to));

    }

    public void print() {
        System.out.println(toString(children.get("A")));
    }       public String toString() {
        return "" + label;
    }
    private class Node {
        private String label;

        public Node(String label) {
            this.label = label;
        }
    }

//    removeNode(label)
//
//    addEdge(from, to)
//
//    removeEdge(from, to)
//    print()
//            ex: A is connected to [B,C]
//            B is connected with A

}

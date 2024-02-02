import java.util.HashMap;

public class Graph {
    private String label;
    private HashMap<String, Node> edges = new HashMap<>();

    public void addNode(String label){

        edges.put(label, new Node(null));
    }
    public void addEdge(String from, String to){
        edges.put(from, new Node(to));

    }

    public void print() {
        for (Object objectName : edges.keySet()) {
            if(edges.get(objectName) != null)
                System.out.println(objectName + " is connected to " + edges.get(objectName).toString() );

        }
    }
    @Override
    public String toString() {
        return "Node{" +
                "nodeName='" + edges + '\'' +
                '}';
    }

    public void removeEdge(String remove) {
        edges.put(remove, null);

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

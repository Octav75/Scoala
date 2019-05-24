package linkedList;

public class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
        }

        public String toString(){
        return "\ndata: " + data + " next -> " + next;
    }
}

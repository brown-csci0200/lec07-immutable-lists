package src;

// A sequence of nodes, with some data
public class NodeList implements IList {
    public int data; // Just an integer for now
    public IList next; // NodeList OR Emptylist

    public NodeList(int data, IList next) {
        this.data = data;
        this.next = next;
    }

    public NodeList addFirst(int newElt) {
        return new NodeList(newElt, this);
    }

    public boolean isEmpty() {
        return false;
    }



}

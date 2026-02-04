package src;

// A sequence of nodes, with some data
public class NodeList extends AbsList /* implements IList */ {
    public int data; // Just an integer for now
    public IList next; // NodeList OR Emptylist

    public NodeList(int data, IList next) {
        this.data = data;
        this.next = next;
    }

    // addFirst implementation moved to abstract class AbsList

    public boolean isEmpty() {
        return false;
    }



}

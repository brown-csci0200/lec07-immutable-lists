package src;

public class EmptyList  implements IList {
    // No fields
    public EmptyList() {
        // Nothing to do
    }

    public NodeList addFirst(int newElt) {
        return new NodeList(newElt, this);
    }

    public boolean isEmpty() {
        return true;
    }
}

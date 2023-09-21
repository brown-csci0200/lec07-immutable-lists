package src;

public class Link extends AbsLinkedList {
    public int first;  // For now, let's say that this list stores ints
    public IList rest; // Link or Empty

    public Link(int f, IList r) {
        this.first = f;
        this.rest = r;
    }

    // addFirst moved to abstract class

    // Find the size of the list
    public int size() {
        return 1 + this.rest.size();
    }

}

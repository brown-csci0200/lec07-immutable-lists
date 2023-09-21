package src;

public class Link extends AbsLinkedList {
    public int first; // Let's say that this list stores ints
    public IList rest; // Link or Empty

    public Link(int f, IList r) {
        this.first = f;
        this.rest = r;
    }

    // Let's make addFirst
//    public Link addFirst(int newElt) {
//        return new Link(newElt, this);
//    }

    public int size() {
        return 1 + this.rest.size();
    }

}

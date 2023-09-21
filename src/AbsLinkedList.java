package src;

// Class for sharing code between our list objects
public abstract class AbsLinkedList implements IList {

    public Link addFirst(int newElt) {
        return new Link(newElt, this);
    }

}

